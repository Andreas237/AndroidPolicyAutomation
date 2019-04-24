.class public final Lorg/jivesoftware/smack/tcp/GetGeoTrustCer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final GeoTrust_SSL_CA_G3:Ljava/lang/String; = "-----BEGIN CERTIFICATE-----\nMIIETzCCAzegAwIBAgIDAjpvMA0GCSqGSIb3DQEBCwUAMEIxCzAJBgNVBAYTAlVT\nMRYwFAYDVQQKEw1HZW9UcnVzdCBJbmMuMRswGQYDVQQDExJHZW9UcnVzdCBHbG9i\nYWwgQ0EwHhcNMTMxMTA1MjEzNjUwWhcNMjIwNTIwMjEzNjUwWjBEMQswCQYDVQQG\nEwJVUzEWMBQGA1UEChMNR2VvVHJ1c3QgSW5jLjEdMBsGA1UEAxMUR2VvVHJ1c3Qg\nU1NMIENBIC0gRzMwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDjvn4K\nhqPPa209K6GXrUkkTdd3uTR5CKWeop7eRxKSPX7qGYax6E89X/fQp3eaWx8KA7UZ\nU9ulIZRpY51qTJEMEEe+EfpshiW3qwRoQjgJZfAU2hme+msLq2LvjafvY3AjqK+B\n89FuiGdT7BKkKXWKp/JXPaKDmJfyCn3U50NuMHhiIllZuHEnRaoPZsZVP/oyFysx\nj0ag+mkUfJ2fWuLrM04QprPtd2PYw5703d95mnrU7t7dmszDt6ldzBE6B7tvl6QB\nI0eVH6N3+liSxsfQvc+TGEK3fveeZerVO8rtrMVwof7UEJrwEgRErBpbeFBFV0xv\nvYDLgVwts7x2oR5lAgMBAAGjggFKMIIBRjAfBgNVHSMEGDAWgBTAephojYn7qwVk\nDBF9qn1luMrMTjAdBgNVHQ4EFgQU0m/3lvSFP3I8MH0j2oV4m6N8WnwwEgYDVR0T\nAQH/BAgwBgEB/wIBADAOBgNVHQ8BAf8EBAMCAQYwNgYDVR0fBC8wLTAroCmgJ4Yl\naHR0cDovL2cxLnN5bWNiLmNvbS9jcmxzL2d0Z2xvYmFsLmNybDAvBggrBgEFBQcB\nAQQjMCEwHwYIKwYBBQUHMAGGE2h0dHA6Ly9nMi5zeW1jYi5jb20wTAYDVR0gBEUw\nQzBBBgpghkgBhvhFAQc2MDMwMQYIKwYBBQUHAgEWJWh0dHA6Ly93d3cuZ2VvdHJ1\nc3QuY29tL3Jlc291cmNlcy9jcHMwKQYDVR0RBCIwIKQeMBwxGjAYBgNVBAMTEVN5\nbWFudGVjUEtJLTEtNTM5MA0GCSqGSIb3DQEBCwUAA4IBAQCg1Pcs+3QLf2TxzUNq\nn2JTHAJ8mJCi7k9o1CAacxI+d7NQ63K87oi+fxfqd4+DYZVPhKHLMk9sIb7SaZZ9\nY73cK6gf0BOEcP72NZWJ+aZ3sEbIu7cT9clgadZM/tKO79NgwYCA4ef7i28heUrg\n3Kkbwbf7w0lZXLV3B0TUl/xJAIlvBk4BcBmsLxHA4uYPL4ZLjXvDuacu9PGsFj45\nSVGeF0tPEDpbpaiSb/361gsDTUdWVxnzy2v189bPsPX1oxHSIFMTNDcFLENaY9+N\nQNaFHlHpURceA1bJ8TCt55sRornQMYGbaLHZ6PPmlH7HrhMvh+3QJbBo+d4IWvMp\nzNSS\n-----END CERTIFICATE-----"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()Ljava/security/cert/Certificate;
    .locals 5

    .line 54
    new-instance v2, Ljava/io/ByteArrayInputStream;

    const-string v0, "-----BEGIN CERTIFICATE-----\nMIIETzCCAzegAwIBAgIDAjpvMA0GCSqGSIb3DQEBCwUAMEIxCzAJBgNVBAYTAlVT\nMRYwFAYDVQQKEw1HZW9UcnVzdCBJbmMuMRswGQYDVQQDExJHZW9UcnVzdCBHbG9i\nYWwgQ0EwHhcNMTMxMTA1MjEzNjUwWhcNMjIwNTIwMjEzNjUwWjBEMQswCQYDVQQG\nEwJVUzEWMBQGA1UEChMNR2VvVHJ1c3QgSW5jLjEdMBsGA1UEAxMUR2VvVHJ1c3Qg\nU1NMIENBIC0gRzMwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDjvn4K\nhqPPa209K6GXrUkkTdd3uTR5CKWeop7eRxKSPX7qGYax6E89X/fQp3eaWx8KA7UZ\nU9ulIZRpY51qTJEMEEe+EfpshiW3qwRoQjgJZfAU2hme+msLq2LvjafvY3AjqK+B\n89FuiGdT7BKkKXWKp/JXPaKDmJfyCn3U50NuMHhiIllZuHEnRaoPZsZVP/oyFysx\nj0ag+mkUfJ2fWuLrM04QprPtd2PYw5703d95mnrU7t7dmszDt6ldzBE6B7tvl6QB\nI0eVH6N3+liSxsfQvc+TGEK3fveeZerVO8rtrMVwof7UEJrwEgRErBpbeFBFV0xv\nvYDLgVwts7x2oR5lAgMBAAGjggFKMIIBRjAfBgNVHSMEGDAWgBTAephojYn7qwVk\nDBF9qn1luMrMTjAdBgNVHQ4EFgQU0m/3lvSFP3I8MH0j2oV4m6N8WnwwEgYDVR0T\nAQH/BAgwBgEB/wIBADAOBgNVHQ8BAf8EBAMCAQYwNgYDVR0fBC8wLTAroCmgJ4Yl\naHR0cDovL2cxLnN5bWNiLmNvbS9jcmxzL2d0Z2xvYmFsLmNybDAvBggrBgEFBQcB\nAQQjMCEwHwYIKwYBBQUHMAGGE2h0dHA6Ly9nMi5zeW1jYi5jb20wTAYDVR0gBEUw\nQzBBBgpghkgBhvhFAQc2MDMwMQYIKwYBBQUHAgEWJWh0dHA6Ly93d3cuZ2VvdHJ1\nc3QuY29tL3Jlc291cmNlcy9jcHMwKQYDVR0RBCIwIKQeMBwxGjAYBgNVBAMTEVN5\nbWFudGVjUEtJLTEtNTM5MA0GCSqGSIb3DQEBCwUAA4IBAQCg1Pcs+3QLf2TxzUNq\nn2JTHAJ8mJCi7k9o1CAacxI+d7NQ63K87oi+fxfqd4+DYZVPhKHLMk9sIb7SaZZ9\nY73cK6gf0BOEcP72NZWJ+aZ3sEbIu7cT9clgadZM/tKO79NgwYCA4ef7i28heUrg\n3Kkbwbf7w0lZXLV3B0TUl/xJAIlvBk4BcBmsLxHA4uYPL4ZLjXvDuacu9PGsFj45\nSVGeF0tPEDpbpaiSb/361gsDTUdWVxnzy2v189bPsPX1oxHSIFMTNDcFLENaY9+N\nQNaFHlHpURceA1bJ8TCt55sRornQMYGbaLHZ6PPmlH7HrhMvh+3QJbBo+d4IWvMp\nzNSS\n-----END CERTIFICATE-----"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 55
    const/4 v3, 0x0

    .line 57
    const-string v0, "X.509"

    :try_start_0
    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v3

    .line 58
    invoke-virtual {v3, v2}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 59
    :catch_0
    move-exception v4

    .line 61
    const-string v0, "GetGeoTrustCer"

    invoke-virtual {v4}, Ljava/security/cert/CertificateException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const/4 v0, 0x0

    return-object v0
.end method
