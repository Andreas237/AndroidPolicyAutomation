.class public final enum Lo/fqb$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fqb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fqb$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fqb$b;

.field public static final enum b:Lo/fqb$b;

.field public static final enum c:Lo/fqb$b;

.field public static final enum d:Lo/fqb$b;

.field public static final enum e:Lo/fqb$b;

.field public static final enum f:Lo/fqb$b;

.field public static final enum g:Lo/fqb$b;

.field public static final enum h:Lo/fqb$b;

.field public static final enum i:Lo/fqb$b;

.field private static final synthetic j:[Lo/fqb$b;

.field public static final enum k:Lo/fqb$b;

.field public static final enum l:Lo/fqb$b;

.field public static final enum m:Lo/fqb$b;

.field public static final enum n:Lo/fqb$b;

.field public static final enum o:Lo/fqb$b;

.field public static final enum p:Lo/fqb$b;

.field public static final enum q:Lo/fqb$b;

.field public static final enum r:Lo/fqb$b;

.field public static final enum s:Lo/fqb$b;

.field public static final enum t:Lo/fqb$b;

.field public static final enum u:Lo/fqb$b;

.field public static final enum v:Lo/fqb$b;

.field public static final enum w:Lo/fqb$b;

.field public static final enum x:Lo/fqb$b;

.field public static final enum y:Lo/fqb$b;

.field public static final enum z:Lo/fqb$b;


# instance fields
.field private A:Ljava/lang/String;

.field private C:B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 115
    new-instance v0, Lo/fqb$b;

    const-string v1, "CLOSE_NOTIFY"

    const-string v2, "close_notify"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->b:Lo/fqb$b;

    .line 116
    new-instance v0, Lo/fqb$b;

    const-string v1, "UNEXPECTED_MESSAGE"

    const-string v2, "unexpected_message"

    const/4 v3, 0x1

    const/16 v4, 0xa

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->a:Lo/fqb$b;

    .line 117
    new-instance v0, Lo/fqb$b;

    const-string v1, "BAD_RECORD_MAC"

    const-string v2, "bad_record_mac"

    const/4 v3, 0x2

    const/16 v4, 0x14

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->d:Lo/fqb$b;

    .line 118
    new-instance v0, Lo/fqb$b;

    const-string v1, "DECRYPTION_FAILED_RESERVED"

    const-string v2, "decryption_failed"

    const/4 v3, 0x3

    const/16 v4, 0x15

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->e:Lo/fqb$b;

    .line 119
    new-instance v0, Lo/fqb$b;

    const-string v1, "RECORD_OVERFLOW"

    const-string v2, "record_overflow"

    const/4 v3, 0x4

    const/16 v4, 0x16

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->c:Lo/fqb$b;

    .line 120
    new-instance v0, Lo/fqb$b;

    const-string v1, "DECOMPRESSION_FAILURE"

    const-string v2, "decompression_failure"

    const/4 v3, 0x5

    const/16 v4, 0x1e

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->f:Lo/fqb$b;

    .line 121
    new-instance v0, Lo/fqb$b;

    const-string v1, "HANDSHAKE_FAILURE"

    const-string v2, "handshake_failure"

    const/4 v3, 0x6

    const/16 v4, 0x28

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->g:Lo/fqb$b;

    .line 122
    new-instance v0, Lo/fqb$b;

    const-string v1, "NO_CERTIFICATE_RESERVED"

    const-string v2, "no_certificate"

    const/4 v3, 0x7

    const/16 v4, 0x29

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->h:Lo/fqb$b;

    .line 123
    new-instance v0, Lo/fqb$b;

    const-string v1, "BAD_CERTIFICATE"

    const-string v2, "bad_certificate"

    const/16 v3, 0x8

    const/16 v4, 0x2a

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->i:Lo/fqb$b;

    .line 124
    new-instance v0, Lo/fqb$b;

    const-string v1, "UNSUPPORTED_CERTIFICATE"

    const-string v2, "unsupported_certificate"

    const/16 v3, 0x9

    const/16 v4, 0x2b

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->k:Lo/fqb$b;

    .line 125
    new-instance v0, Lo/fqb$b;

    const-string v1, "CERTIFICATE_REVOKED"

    const-string v2, "certificate_revoked"

    const/16 v3, 0xa

    const/16 v4, 0x2c

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->p:Lo/fqb$b;

    .line 126
    new-instance v0, Lo/fqb$b;

    const-string v1, "CERTIFICATE_EXPIRED"

    const-string v2, "certificate_expired"

    const/16 v3, 0xb

    const/16 v4, 0x2d

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->n:Lo/fqb$b;

    .line 127
    new-instance v0, Lo/fqb$b;

    const-string v1, "CERTIFICATE_UNKNOWN"

    const-string v2, "certificate_unknown"

    const/16 v3, 0xc

    const/16 v4, 0x2e

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->m:Lo/fqb$b;

    .line 128
    new-instance v0, Lo/fqb$b;

    const-string v1, "ILLEGAL_PARAMETER"

    const-string v2, "illegal_parameter"

    const/16 v3, 0xd

    const/16 v4, 0x2f

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->o:Lo/fqb$b;

    .line 129
    new-instance v0, Lo/fqb$b;

    const-string v1, "UNKNOWN_CA"

    const-string v2, "unknown_ca"

    const/16 v3, 0xe

    const/16 v4, 0x30

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->l:Lo/fqb$b;

    .line 130
    new-instance v0, Lo/fqb$b;

    const-string v1, "ACCESS_DENIED"

    const-string v2, "access_denied"

    const/16 v3, 0xf

    const/16 v4, 0x31

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->u:Lo/fqb$b;

    .line 131
    new-instance v0, Lo/fqb$b;

    const-string v1, "DECODE_ERROR"

    const-string v2, "decode_error"

    const/16 v3, 0x10

    const/16 v4, 0x32

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->r:Lo/fqb$b;

    .line 132
    new-instance v0, Lo/fqb$b;

    const-string v1, "DECRYPT_ERROR"

    const-string v2, "decrypt_error"

    const/16 v3, 0x11

    const/16 v4, 0x33

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->t:Lo/fqb$b;

    .line 133
    new-instance v0, Lo/fqb$b;

    const-string v1, "EXPORT_RESTRICTION_RESERVED"

    const-string v2, "export_restriction"

    const/16 v3, 0x12

    const/16 v4, 0x3c

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->s:Lo/fqb$b;

    .line 134
    new-instance v0, Lo/fqb$b;

    const-string v1, "PROTOCOL_VERSION"

    const-string v2, "protocol_version"

    const/16 v3, 0x13

    const/16 v4, 0x46

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->q:Lo/fqb$b;

    .line 135
    new-instance v0, Lo/fqb$b;

    const-string v1, "INSUFFICIENT_SECURITY"

    const-string v2, "insufficient_security"

    const/16 v3, 0x14

    const/16 v4, 0x47

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->z:Lo/fqb$b;

    .line 136
    new-instance v0, Lo/fqb$b;

    const-string v1, "INTERNAL_ERROR"

    const-string v2, "internal_error"

    const/16 v3, 0x15

    const/16 v4, 0x50

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->y:Lo/fqb$b;

    .line 137
    new-instance v0, Lo/fqb$b;

    const-string v1, "USER_CANCELED"

    const-string v2, "user_canceled"

    const/16 v3, 0x16

    const/16 v4, 0x5a

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->w:Lo/fqb$b;

    .line 138
    new-instance v0, Lo/fqb$b;

    const-string v1, "NO_RENEGOTIATION"

    const-string v2, "no_negotiation"

    const/16 v3, 0x17

    const/16 v4, 0x64

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->v:Lo/fqb$b;

    .line 139
    new-instance v0, Lo/fqb$b;

    const-string v1, "UNSUPPORTED_EXTENSION"

    const-string v2, "unsupported_extension"

    const/16 v3, 0x18

    const/16 v4, 0x6e

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fqb$b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fqb$b;->x:Lo/fqb$b;

    .line 113
    const/16 v0, 0x19

    new-array v0, v0, [Lo/fqb$b;

    sget-object v1, Lo/fqb$b;->b:Lo/fqb$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->a:Lo/fqb$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->d:Lo/fqb$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->e:Lo/fqb$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->c:Lo/fqb$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->f:Lo/fqb$b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->g:Lo/fqb$b;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->h:Lo/fqb$b;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->i:Lo/fqb$b;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->k:Lo/fqb$b;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->p:Lo/fqb$b;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->n:Lo/fqb$b;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->m:Lo/fqb$b;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->o:Lo/fqb$b;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->l:Lo/fqb$b;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->u:Lo/fqb$b;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->r:Lo/fqb$b;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->t:Lo/fqb$b;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->s:Lo/fqb$b;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->q:Lo/fqb$b;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->z:Lo/fqb$b;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->y:Lo/fqb$b;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->w:Lo/fqb$b;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->v:Lo/fqb$b;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lo/fqb$b;->x:Lo/fqb$b;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sput-object v0, Lo/fqb$b;->j:[Lo/fqb$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;)V"
        }
    .end annotation

    .line 144
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 145
    int-to-byte v0, p3

    iput-byte v0, p0, Lo/fqb$b;->C:B

    .line 146
    iput-object p4, p0, Lo/fqb$b;->A:Ljava/lang/String;

    .line 147
    return-void
.end method

.method public static d(I)Lo/fqb$b;
    .locals 6

    .line 164
    invoke-static {}, Lo/fqb$b;->values()[Lo/fqb$b;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 165
    iget-byte v0, v5, Lo/fqb$b;->C:B

    int-to-byte v1, p0

    if-ne v0, v1, :cond_0

    .line 166
    return-object v5

    .line 164
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 169
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fqb$b;
    .locals 1

    .line 113
    const-class v0, Lo/fqb$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fqb$b;

    return-object v0
.end method

.method public static values()[Lo/fqb$b;
    .locals 1

    .line 113
    sget-object v0, Lo/fqb$b;->j:[Lo/fqb$b;

    invoke-virtual {v0}, [Lo/fqb$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fqb$b;

    return-object v0
.end method


# virtual methods
.method public b()B
    .locals 1

    .line 150
    iget-byte v0, p0, Lo/fqb$b;->C:B

    return v0
.end method
