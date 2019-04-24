.class public Lo/dso;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Lo/dso;>;"
        }
    .end annotation
.end field

.field private static final c:[Lo/dso;

.field private static final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/dso;>;"
        }
    .end annotation
.end field


# instance fields
.field public final b:I

.field public final d:Ljava/lang/String;

.field private final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 28
    const/16 v0, 0x150

    new-array v0, v0, [Lo/dso;

    new-instance v1, Lo/dso;

    const-string v2, "TLS_NULL_WITH_NULL_NULL"

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_NULL_MD5"

    const-string v3, "SSL_RSA_WITH_NULL_MD5"

    const/4 v4, 0x1

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_NULL_SHA"

    const-string v3, "SSL_RSA_WITH_NULL_SHA"

    const/4 v4, 0x2

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_EXPORT_WITH_RC4_40_MD5"

    const-string v3, "SSL_RSA_EXPORT_WITH_RC4_40_MD5"

    const/4 v4, 0x3

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_RC4_128_MD5"

    const-string v3, "SSL_RSA_WITH_RC4_128_MD5"

    const/4 v4, 0x4

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_RC4_128_SHA"

    const-string v3, "SSL_RSA_WITH_RC4_128_SHA"

    const/4 v4, 0x5

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x5

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_EXPORT_WITH_RC2_CBC_40_MD5"

    const/4 v3, 0x6

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/4 v2, 0x6

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_IDEA_CBC_SHA"

    const/4 v3, 0x7

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/4 v2, 0x7

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA"

    const-string v3, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"

    const/16 v4, 0x8

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x8

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_DES_CBC_SHA"

    const-string v3, "SSL_RSA_WITH_DES_CBC_SHA"

    const/16 v4, 0x9

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x9

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_3DES_EDE_CBC_SHA"

    const-string v3, "SSL_RSA_WITH_3DES_EDE_CBC_SHA"

    const/16 v4, 0xa

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xa

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_EXPORT_WITH_DES40_CBC_SHA"

    const/16 v3, 0xb

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xb

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_DES_CBC_SHA"

    const/16 v3, 0xc

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xc

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_3DES_EDE_CBC_SHA"

    const/16 v3, 0xd

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xd

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_EXPORT_WITH_DES40_CBC_SHA"

    const/16 v3, 0xe

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xe

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_DES_CBC_SHA"

    const/16 v3, 0xf

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xf

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_3DES_EDE_CBC_SHA"

    const/16 v3, 0x10

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x10

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"

    const-string v3, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"

    const/16 v4, 0x11

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x11

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_DES_CBC_SHA"

    const-string v3, "SSL_DHE_DSS_WITH_DES_CBC_SHA"

    const/16 v4, 0x12

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x12

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA"

    const-string v3, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"

    const/16 v4, 0x13

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x13

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"

    const-string v3, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"

    const/16 v4, 0x14

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x14

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_DES_CBC_SHA"

    const-string v3, "SSL_DHE_RSA_WITH_DES_CBC_SHA"

    const/16 v4, 0x15

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x15

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA"

    const-string v3, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"

    const/16 v4, 0x16

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x16

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5"

    const-string v3, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"

    const/16 v4, 0x17

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x17

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_RC4_128_MD5"

    const-string v3, "SSL_DH_anon_WITH_RC4_128_MD5"

    const/16 v4, 0x18

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x18

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA"

    const-string v3, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"

    const/16 v4, 0x19

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x19

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_DES_CBC_SHA"

    const-string v3, "SSL_DH_anon_WITH_DES_CBC_SHA"

    const/16 v4, 0x1a

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA"

    const-string v3, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"

    const/16 v4, 0x1b

    invoke-direct {v1, v4, v2, v3}, Lo/dso;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_WITH_DES_CBC_SHA"

    const/16 v3, 0x1e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"

    const/16 v3, 0x1f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_WITH_RC4_128_SHA"

    const/16 v3, 0x20

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_WITH_IDEA_CBC_SHA"

    const/16 v3, 0x21

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_WITH_DES_CBC_MD5"

    const/16 v3, 0x22

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x20

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"

    const/16 v3, 0x23

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x21

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_WITH_RC4_128_MD5"

    const/16 v3, 0x24

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x22

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_WITH_IDEA_CBC_MD5"

    const/16 v3, 0x25

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x23

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"

    const/16 v3, 0x26

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x24

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_EXPORT_WITH_RC2_CBC_40_SHA"

    const/16 v3, 0x27

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x25

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"

    const/16 v3, 0x28

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x26

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"

    const/16 v3, 0x29

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x27

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_EXPORT_WITH_RC2_CBC_40_MD5"

    const/16 v3, 0x2a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x28

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"

    const/16 v3, 0x2b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x29

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_NULL_SHA"

    const/16 v3, 0x2c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_NULL_SHA"

    const/16 v3, 0x2d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_NULL_SHA"

    const/16 v3, 0x2e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_AES_128_CBC_SHA"

    const/16 v3, 0x2f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_AES_128_CBC_SHA"

    const/16 v3, 0x30

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_AES_128_CBC_SHA"

    const/16 v3, 0x31

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"

    const/16 v3, 0x32

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x30

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"

    const/16 v3, 0x33

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x31

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_AES_128_CBC_SHA"

    const/16 v3, 0x34

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x32

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_AES_256_CBC_SHA"

    const/16 v3, 0x35

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x33

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_AES_256_CBC_SHA"

    const/16 v3, 0x36

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x34

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_AES_256_CBC_SHA"

    const/16 v3, 0x37

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x35

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"

    const/16 v3, 0x38

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x36

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"

    const/16 v3, 0x39

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x37

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_AES_256_CBC_SHA"

    const/16 v3, 0x3a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x38

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_NULL_SHA256"

    const/16 v3, 0x3b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x39

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_AES_128_CBC_SHA256"

    const/16 v3, 0x3c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_AES_256_CBC_SHA256"

    const/16 v3, 0x3d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x3b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_AES_128_CBC_SHA256"

    const/16 v3, 0x3e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x3c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_AES_128_CBC_SHA256"

    const/16 v3, 0x3f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x3d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"

    const/16 v3, 0x40

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x3e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"

    const/16 v3, 0x41

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x3f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA"

    const/16 v3, 0x42

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x40

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_CAMELLIA_128_CBC_SHA"

    const/16 v3, 0x43

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x41

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"

    const/16 v3, 0x44

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x42

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"

    const/16 v3, 0x45

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x43

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA"

    const/16 v3, 0x46

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x44

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_EXPORT1024_WITH_RC4_56_MD5"

    const/16 v3, 0x60

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x45

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_EXPORT1024_WITH_RC2_CBC_56_MD5"

    const/16 v3, 0x61

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x46

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_EXPORT1024_WITH_DES_CBC_SHA"

    const/16 v3, 0x62

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x47

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_EXPORT1024_WITH_DES_CBC_SHA"

    const/16 v3, 0x63

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x48

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_EXPORT1024_WITH_RC4_56_SHA"

    const/16 v3, 0x64

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x49

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_EXPORT1024_WITH_RC4_56_SHA"

    const/16 v3, 0x65

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x4a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_RC4_128_SHA"

    const/16 v3, 0x66

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x4b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"

    const/16 v3, 0x67

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x4c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_AES_256_CBC_SHA256"

    const/16 v3, 0x68

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x4d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_AES_256_CBC_SHA256"

    const/16 v3, 0x69

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x4e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"

    const/16 v3, 0x6a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x4f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"

    const/16 v3, 0x6b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x50

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_AES_128_CBC_SHA256"

    const/16 v3, 0x6c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x51

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_AES_256_CBC_SHA256"

    const/16 v3, 0x6d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x52

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"

    const/16 v3, 0x84

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x53

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA"

    const/16 v3, 0x85

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x54

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA"

    const/16 v3, 0x86

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x55

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"

    const/16 v3, 0x87

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x56

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"

    const/16 v3, 0x88

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x57

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA"

    const/16 v3, 0x89

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x58

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_RC4_128_SHA"

    const/16 v3, 0x8a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x59

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_3DES_EDE_CBC_SHA"

    const/16 v3, 0x8b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x5a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_AES_128_CBC_SHA"

    const/16 v3, 0x8c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x5b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_AES_256_CBC_SHA"

    const/16 v3, 0x8d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x5c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_RC4_128_SHA"

    const/16 v3, 0x8e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x5d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA"

    const/16 v3, 0x8f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x5e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_AES_128_CBC_SHA"

    const/16 v3, 0x90

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x5f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_AES_256_CBC_SHA"

    const/16 v3, 0x91

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x60

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_RC4_128_SHA"

    const/16 v3, 0x92

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x61

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA"

    const/16 v3, 0x93

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x62

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_AES_128_CBC_SHA"

    const/16 v3, 0x94

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x63

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_AES_256_CBC_SHA"

    const/16 v3, 0x95

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x64

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_SEED_CBC_SHA"

    const/16 v3, 0x96

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x65

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_SEED_CBC_SHA"

    const/16 v3, 0x97

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x66

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_SEED_CBC_SHA"

    const/16 v3, 0x98

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x67

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_SEED_CBC_SHA"

    const/16 v3, 0x99

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x68

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_SEED_CBC_SHA"

    const/16 v3, 0x9a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x69

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_SEED_CBC_SHA"

    const/16 v3, 0x9b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x6a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_AES_128_GCM_SHA256"

    const/16 v3, 0x9c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x6b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_AES_256_GCM_SHA384"

    const/16 v3, 0x9d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x6c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"

    const/16 v3, 0x9e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x6d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"

    const/16 v3, 0x9f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x6e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_AES_128_GCM_SHA256"

    const/16 v3, 0xa0

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x6f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_AES_256_GCM_SHA384"

    const/16 v3, 0xa1

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x70

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"

    const/16 v3, 0xa2

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x71

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"

    const/16 v3, 0xa3

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x72

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_AES_128_GCM_SHA256"

    const/16 v3, 0xa4

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x73

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_AES_256_GCM_SHA384"

    const/16 v3, 0xa5

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x74

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_AES_128_GCM_SHA256"

    const/16 v3, 0xa6

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x75

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_AES_256_GCM_SHA384"

    const/16 v3, 0xa7

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x76

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_AES_128_GCM_SHA256"

    const/16 v3, 0xa8

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x77

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_AES_256_GCM_SHA384"

    const/16 v3, 0xa9

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x78

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_AES_128_GCM_SHA256"

    const/16 v3, 0xaa

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x79

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_AES_256_GCM_SHA384"

    const/16 v3, 0xab

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x7a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_AES_128_GCM_SHA256"

    const/16 v3, 0xac

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x7b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_AES_256_GCM_SHA384"

    const/16 v3, 0xad

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x7c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_AES_128_CBC_SHA256"

    const/16 v3, 0xae

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x7d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_AES_256_CBC_SHA384"

    const/16 v3, 0xaf

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x7e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_NULL_SHA256"

    const/16 v3, 0xb0

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x7f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_NULL_SHA384"

    const/16 v3, 0xb1

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x80

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_AES_128_CBC_SHA256"

    const/16 v3, 0xb2

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x81

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_AES_256_CBC_SHA384"

    const/16 v3, 0xb3

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x82

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_NULL_SHA256"

    const/16 v3, 0xb4

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x83

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_NULL_SHA384"

    const/16 v3, 0xb5

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x84

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_AES_128_CBC_SHA256"

    const/16 v3, 0xb6

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x85

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_AES_256_CBC_SHA384"

    const/16 v3, 0xb7

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x86

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_NULL_SHA256"

    const/16 v3, 0xb8

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x87

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_NULL_SHA384"

    const/16 v3, 0xb9

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x88

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256"

    const/16 v3, 0xba

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x89

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256"

    const/16 v3, 0xbb

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x8a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_CAMELLIA_128_CBC_SHA256"

    const/16 v3, 0xbc

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x8b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256"

    const/16 v3, 0xbd

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x8c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256"

    const/16 v3, 0xbe

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x8d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256"

    const/16 v3, 0xbf

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x8e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA256"

    const/16 v3, 0xc0

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x8f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256"

    const/16 v3, 0xc1

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x90

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256"

    const/16 v3, 0xc2

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x91

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256"

    const/16 v3, 0xc3

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x92

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256"

    const/16 v3, 0xc4

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x93

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256"

    const/16 v3, 0xc5

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x94

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    const/16 v3, 0xff

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x95

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_FALLBACK_SCSV"

    const/16 v3, 0x5600

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x96

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_NULL_SHA"

    const v3, 0xc001

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x97

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"

    const v3, 0xc002

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x98

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"

    const v3, 0xc003

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x99

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"

    const v3, 0xc004

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x9a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"

    const v3, 0xc005

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x9b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_NULL_SHA"

    const v3, 0xc006

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x9c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"

    const v3, 0xc007

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x9d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"

    const v3, 0xc008

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x9e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"

    const v3, 0xc009

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x9f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"

    const v3, 0xc00a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xa0

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_NULL_SHA"

    const v3, 0xc00b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xa1

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_RC4_128_SHA"

    const v3, 0xc00c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xa2

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"

    const v3, 0xc00d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xa3

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"

    const v3, 0xc00e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xa4

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"

    const v3, 0xc00f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xa5

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_NULL_SHA"

    const v3, 0xc010

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xa6

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_RC4_128_SHA"

    const v3, 0xc011

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xa7

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"

    const v3, 0xc012

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xa8

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"

    const v3, 0xc013

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xa9

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"

    const v3, 0xc014

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xaa

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_anon_WITH_NULL_SHA"

    const v3, 0xc015

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xab

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_anon_WITH_RC4_128_SHA"

    const v3, 0xc016

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xac

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"

    const v3, 0xc017

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xad

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"

    const v3, 0xc018

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xae

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"

    const v3, 0xc019

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xaf

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA"

    const v3, 0xc01a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xb0

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_SRP_SHA_RSA_WITH_3DES_EDE_CBC_SHA"

    const v3, 0xc01b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xb1

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_SRP_SHA_DSS_WITH_3DES_EDE_CBC_SHA"

    const v3, 0xc01c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xb2

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_SRP_SHA_WITH_AES_128_CBC_SHA"

    const v3, 0xc01d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xb3

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_SRP_SHA_RSA_WITH_AES_128_CBC_SHA"

    const v3, 0xc01e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xb4

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_SRP_SHA_DSS_WITH_AES_128_CBC_SHA"

    const v3, 0xc01f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xb5

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_SRP_SHA_WITH_AES_256_CBC_SHA"

    const v3, 0xc020

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xb6

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_SRP_SHA_RSA_WITH_AES_256_CBC_SHA"

    const v3, 0xc021

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xb7

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_SRP_SHA_DSS_WITH_AES_256_CBC_SHA"

    const v3, 0xc022

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xb8

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"

    const v3, 0xc023

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xb9

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"

    const v3, 0xc024

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xba

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"

    const v3, 0xc025

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xbb

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"

    const v3, 0xc026

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xbc

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"

    const v3, 0xc027

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xbd

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    const v3, 0xc028

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xbe

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"

    const v3, 0xc029

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xbf

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"

    const v3, 0xc02a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xc0

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"

    const v3, 0xc02b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xc1

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"

    const v3, 0xc02c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xc2

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"

    const v3, 0xc02d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xc3

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"

    const v3, 0xc02e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xc4

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"

    const v3, 0xc02f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xc5

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"

    const v3, 0xc030

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xc6

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"

    const v3, 0xc031

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xc7

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"

    const v3, 0xc032

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xc8

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_RC4_128_SHA"

    const v3, 0xc033

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xc9

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_3DES_EDE_CBC_SHA"

    const v3, 0xc034

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xca

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"

    const v3, 0xc035

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xcb

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"

    const v3, 0xc036

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xcc

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256"

    const v3, 0xc037

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xcd

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384"

    const v3, 0xc038

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xce

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_NULL_SHA"

    const v3, 0xc039

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xcf

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_NULL_SHA256"

    const v3, 0xc03a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xd0

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_NULL_SHA384"

    const v3, 0xc03b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xd1

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc03c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xd2

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc03d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xd3

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc03e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xd4

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc03f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xd5

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc040

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xd6

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc041

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xd7

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc042

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xd8

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc043

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xd9

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc044

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xda

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc045

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xdb

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc046

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xdc

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc047

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xdd

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc048

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xde

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc049

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xdf

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc04a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xe0

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc04b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xe1

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc04c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xe2

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc04d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xe3

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc04e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xe4

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc04f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xe5

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc050

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xe6

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc051

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xe7

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc052

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xe8

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc053

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xe9

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc054

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xea

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc055

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xeb

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc056

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xec

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc057

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xed

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc058

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xee

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc059

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xef

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc05a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xf0

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc05b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xf1

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc05c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xf2

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc05d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xf3

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc05e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xf4

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc05f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xf5

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc060

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xf6

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc061

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xf7

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc062

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xf8

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc063

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xf9

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc064

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xfa

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc065

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xfb

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc066

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xfc

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc067

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xfd

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc068

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xfe

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc069

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0xff

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc06a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x100

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc06b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x101

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc06c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x102

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc06d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x103

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_ARIA_128_GCM_SHA256"

    const v3, 0xc06e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x104

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_ARIA_256_GCM_SHA384"

    const v3, 0xc06f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x105

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_ARIA_128_CBC_SHA256"

    const v3, 0xc070

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x106

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_ARIA_256_CBC_SHA384"

    const v3, 0xc071

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x107

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256"

    const v3, 0xc072

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x108

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384"

    const v3, 0xc073

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x109

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256"

    const v3, 0xc074

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x10a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384"

    const v3, 0xc075

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x10b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256"

    const v3, 0xc076

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x10c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384"

    const v3, 0xc077

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x10d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256"

    const v3, 0xc078

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x10e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384"

    const v3, 0xc079

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x10f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc07a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x110

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc07b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x111

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc07c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x112

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc07d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x113

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc07e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x114

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc07f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x115

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc080

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x116

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc081

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x117

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc082

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x118

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc083

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x119

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc084

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x11a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DH_anon_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc085

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x11b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc086

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x11c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc087

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x11d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc088

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x11e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc089

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x11f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc08a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x120

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc08b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x121

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc08c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x122

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc08d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x123

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc08e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x124

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc08f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x125

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc090

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x126

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc091

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x127

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256"

    const v3, 0xc092

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x128

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384"

    const v3, 0xc093

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x129

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_CAMELLIA_128_CBC_SHA256"

    const v3, 0xc094

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x12a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_CAMELLIA_256_CBC_SHA384"

    const v3, 0xc095

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x12b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_CAMELLIA_128_CBC_SHA256"

    const v3, 0xc096

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x12c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_CAMELLIA_256_CBC_SHA384"

    const v3, 0xc097

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x12d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_CAMELLIA_128_CBC_SHA256"

    const v3, 0xc098

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x12e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_CAMELLIA_256_CBC_SHA384"

    const v3, 0xc099

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x12f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_CAMELLIA_128_CBC_SHA256"

    const v3, 0xc09a

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x130

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384"

    const v3, 0xc09b

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x131

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_AES_128_CCM"

    const v3, 0xc09c

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x132

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_AES_256_CCM"

    const v3, 0xc09d

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x133

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_AES_128_CCM"

    const v3, 0xc09e

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x134

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_AES_256_CCM"

    const v3, 0xc09f

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x135

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_AES_128_CCM_8"

    const v3, 0xc0a0

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x136

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_WITH_AES_256_CCM_8"

    const v3, 0xc0a1

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x137

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_AES_128_CCM_8"

    const v3, 0xc0a2

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x138

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_AES_256_CCM_8"

    const v3, 0xc0a3

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x139

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_AES_128_CCM"

    const v3, 0xc0a4

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x13a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_AES_256_CCM"

    const v3, 0xc0a5

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x13b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_AES_128_CCM"

    const v3, 0xc0a6

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x13c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_AES_256_CCM"

    const v3, 0xc0a7

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x13d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_AES_128_CCM_8"

    const v3, 0xc0a8

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x13e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_AES_256_CCM_8"

    const v3, 0xc0a9

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x13f

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_DHE_WITH_AES_128_CCM_8"

    const v3, 0xc0aa

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x140

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_DHE_WITH_AES_256_CCM_8"

    const v3, 0xc0ab

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x141

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_AES_128_CCM"

    const v3, 0xc0ac

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x142

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_AES_256_CCM"

    const v3, 0xc0ad

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x143

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8"

    const v3, 0xc0ae

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x144

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8"

    const v3, 0xc0af

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x145

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_OLD"

    const v3, 0xcc13

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x146

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_OLD"

    const v3, 0xcc14

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x147

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_OLD"

    const v3, 0xcc15

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x148

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    const v3, 0xcca8

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x149

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"

    const v3, 0xcca9

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x14a

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    const v3, 0xccaa

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x14b

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_PSK_WITH_CHACHA20_POLY1305_SHA256"

    const v3, 0xccab

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x14c

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"

    const v3, 0xccac

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x14d

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_DHE_PSK_WITH_CHACHA20_POLY1305_SHA256"

    const v3, 0xccad

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x14e

    aput-object v1, v0, v2

    new-instance v1, Lo/dso;

    const-string v2, "TLS_RSA_PSK_WITH_CHACHA20_POLY1305_SHA256"

    const v3, 0xccae

    invoke-direct {v1, v3, v2}, Lo/dso;-><init>(ILjava/lang/String;)V

    const/16 v2, 0x14f

    aput-object v1, v0, v2

    sput-object v0, Lo/dso;->c:[Lo/dso;

    .line 380
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 381
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 382
    sget-object v7, Lo/dso;->c:[Lo/dso;

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_3

    aget-object v10, v7, v9

    .line 383
    iget v0, v10, Lo/dso;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 384
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cipher suite multiply defined: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v10, Lo/dso;->b:I

    .line 385
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 387
    :cond_0
    iget-object v11, v10, Lo/dso;->d:Ljava/lang/String;

    .line 388
    invoke-interface {v6, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 389
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cipher suite multiply defined: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v10, Lo/dso;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 392
    :cond_1
    invoke-virtual {v10}, Lo/dso;->e()Ljava/lang/String;

    move-result-object v12

    .line 393
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 394
    invoke-interface {v6, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 395
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cipher suite multiply defined: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v10, Lo/dso;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 382
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 401
    :cond_3
    sput-object v5, Lo/dso;->a:Ljava/util/Map;

    .line 402
    sput-object v6, Lo/dso;->e:Ljava/util/Map;

    .line 403
    return-void
.end method

.method private constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 409
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 410
    iput p1, p0, Lo/dso;->b:I

    .line 411
    iput-object p2, p0, Lo/dso;->d:Ljava/lang/String;

    .line 412
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dso;->h:Ljava/lang/String;

    .line 413
    return-void
.end method

.method private constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 416
    iput p1, p0, Lo/dso;->b:I

    .line 417
    iput-object p2, p0, Lo/dso;->d:Ljava/lang/String;

    .line 418
    iput-object p3, p0, Lo/dso;->h:Ljava/lang/String;

    .line 419
    return-void
.end method

.method public static a(Ljava/lang/String;)Lo/dso;
    .locals 4

    .line 422
    sget-object v0, Lo/dso;->e:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dso;

    .line 423
    if-eqz v3, :cond_0

    .line 424
    return-object v3

    .line 426
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown cipher suite: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    .line 438
    iget-object v0, p0, Lo/dso;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dso;->h:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/dso;->d:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 456
    if-ne p0, p1, :cond_0

    .line 457
    const/4 v0, 0x1

    return v0

    .line 459
    :cond_0
    if-nez p1, :cond_1

    .line 460
    const/4 v0, 0x0

    return v0

    .line 462
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 463
    const/4 v0, 0x0

    return v0

    .line 465
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/dso;

    .line 466
    iget v0, p0, Lo/dso;->b:I

    iget v1, v2, Lo/dso;->b:I

    if-eq v0, v1, :cond_3

    .line 467
    const/4 v0, 0x0

    return v0

    .line 469
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 448
    const/16 v2, 0x1f

    .line 449
    const/4 v3, 0x1

    .line 450
    iget v0, p0, Lo/dso;->b:I

    add-int/lit8 v3, v0, 0x1f

    .line 451
    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 443
    iget-object v0, p0, Lo/dso;->d:Ljava/lang/String;

    return-object v0
.end method
