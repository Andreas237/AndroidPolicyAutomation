.class public final enum Lo/fqd$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fqd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fqd$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fqd$e;

.field public static final enum b:Lo/fqd$e;

.field public static final enum c:Lo/fqd$e;

.field public static final enum d:Lo/fqd$e;

.field public static final enum e:Lo/fqd$e;

.field public static final enum f:Lo/fqd$e;

.field public static final enum g:Lo/fqd$e;

.field public static final enum h:Lo/fqd$e;

.field public static final enum i:Lo/fqd$e;

.field public static final enum k:Lo/fqd$e;

.field private static final synthetic m:[Lo/fqd$e;


# instance fields
.field private final l:Z

.field private final n:Ljava/lang/String;

.field private final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 247
    new-instance v0, Lo/fqd$e;

    const-string v1, "RSA_SIGN"

    const-string v4, "RSA"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/fqd$e;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v0, Lo/fqd$e;->b:Lo/fqd$e;

    .line 248
    new-instance v0, Lo/fqd$e;

    const-string v1, "DSS_SIGN"

    const-string v4, "DSA"

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/fqd$e;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v0, Lo/fqd$e;->a:Lo/fqd$e;

    .line 249
    new-instance v0, Lo/fqd$e;

    const-string v1, "RSA_FIXED_DH"

    const-string v4, "DH"

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fqd$e;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v0, Lo/fqd$e;->e:Lo/fqd$e;

    .line 250
    new-instance v0, Lo/fqd$e;

    const-string v1, "DSS_FIXED_DH"

    const-string v4, "DH"

    const/4 v2, 0x3

    const/4 v3, 0x4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fqd$e;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v0, Lo/fqd$e;->d:Lo/fqd$e;

    .line 251
    new-instance v0, Lo/fqd$e;

    const-string v1, "RSA_EPHEMERAL_DH_RESERVED"

    const-string v4, "DH"

    const/4 v2, 0x4

    const/4 v3, 0x5

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fqd$e;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v0, Lo/fqd$e;->c:Lo/fqd$e;

    .line 252
    new-instance v0, Lo/fqd$e;

    const-string v1, "DSS_EPHEMERAL_DH_RESERVED"

    const-string v4, "DH"

    const/4 v2, 0x5

    const/4 v3, 0x6

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fqd$e;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v0, Lo/fqd$e;->g:Lo/fqd$e;

    .line 253
    new-instance v0, Lo/fqd$e;

    const-string v1, "FORTEZZA_DMS_RESERVED"

    const-string v4, "UNKNOWN"

    const/4 v2, 0x6

    const/16 v3, 0x14

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fqd$e;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v0, Lo/fqd$e;->f:Lo/fqd$e;

    .line 254
    new-instance v0, Lo/fqd$e;

    const-string v1, "ECDSA_SIGN"

    const-string v4, "EC"

    const/4 v2, 0x7

    const/16 v3, 0x40

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/fqd$e;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v0, Lo/fqd$e;->k:Lo/fqd$e;

    .line 255
    new-instance v0, Lo/fqd$e;

    const-string v1, "RSA_FIXED_ECDH"

    const-string v4, "DH"

    const/16 v2, 0x8

    const/16 v3, 0x41

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fqd$e;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v0, Lo/fqd$e;->h:Lo/fqd$e;

    .line 256
    new-instance v0, Lo/fqd$e;

    const-string v1, "ECDSA_FIXED_ECDH"

    const-string v4, "DH"

    const/16 v2, 0x9

    const/16 v3, 0x42

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/fqd$e;-><init>(Ljava/lang/String;IILjava/lang/String;Z)V

    sput-object v0, Lo/fqd$e;->i:Lo/fqd$e;

    .line 245
    const/16 v0, 0xa

    new-array v0, v0, [Lo/fqd$e;

    sget-object v1, Lo/fqd$e;->b:Lo/fqd$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fqd$e;->a:Lo/fqd$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fqd$e;->e:Lo/fqd$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fqd$e;->d:Lo/fqd$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/fqd$e;->c:Lo/fqd$e;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/fqd$e;->g:Lo/fqd$e;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/fqd$e;->f:Lo/fqd$e;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/fqd$e;->k:Lo/fqd$e;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/fqd$e;->h:Lo/fqd$e;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lo/fqd$e;->i:Lo/fqd$e;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lo/fqd$e;->m:[Lo/fqd$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Z)V"
        }
    .end annotation

    .line 262
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 263
    iput p3, p0, Lo/fqd$e;->o:I

    .line 264
    iput-object p4, p0, Lo/fqd$e;->n:Ljava/lang/String;

    .line 265
    iput-boolean p5, p0, Lo/fqd$e;->l:Z

    .line 266
    return-void
.end method

.method public static e(I)Lo/fqd$e;
    .locals 5

    .line 314
    invoke-static {}, Lo/fqd$e;->values()[Lo/fqd$e;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 315
    iget v0, v4, Lo/fqd$e;->o:I

    if-ne v0, p0, :cond_0

    .line 316
    return-object v4

    .line 314
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 319
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fqd$e;
    .locals 1

    .line 245
    const-class v0, Lo/fqd$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fqd$e;

    return-object v0
.end method

.method public static values()[Lo/fqd$e;
    .locals 1

    .line 245
    sget-object v0, Lo/fqd$e;->m:[Lo/fqd$e;

    invoke-virtual {v0}, [Lo/fqd$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fqd$e;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 275
    iget v0, p0, Lo/fqd$e;->o:I

    return v0
.end method

.method public b()Z
    .locals 1

    .line 293
    iget-boolean v0, p0, Lo/fqd$e;->l:Z

    return v0
.end method

.method public d(Ljava/lang/String;)Z
    .locals 1

    .line 303
    iget-object v0, p0, Lo/fqd$e;->n:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
