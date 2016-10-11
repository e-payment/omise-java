package co.omise.resources;

import co.omise.Endpoint;
import co.omise.models.Account;
import co.omise.models.OmiseException;
import okhttp3.OkHttpClient;

import java.io.IOException;

public class AccountResource extends Resource {
    public AccountResource(OkHttpClient httpClient) {
        super(httpClient);
    }

    public Account get() throws IOException, OmiseException {
        return httpGet(buildUrl(Endpoint.API, "account")).returns(Account.class);
    }
}
