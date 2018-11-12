# Run the credhubdemo

This demo uses spring annotation properties backed by a credhub infrastructure to inject credentials.
It assumes you have deployed https://docs.pivotal.io/credhub-service-broker/

# Create the service

```bash
cf create-service credhub default mongo -c '{"uri":"mongodb://admin:passwordsecured@10.11.12.13/pivotalparisdb"}'
```

## Deploy the app and bind the app

```
mvn package && cf push
cf bind-service credhubdemo mongo
```

## show the encrypted credentials

```bash
cf env credhubdemo
```

## show the unencrypted creds thru the app

```
curl <app_route>\demo
```
