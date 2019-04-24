.class public final enum Lo/fra;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fra;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fra;

.field public static final enum b:Lo/fra;

.field public static final enum c:Lo/fra;

.field public static final enum d:Lo/fra;

.field public static final enum e:Lo/fra;

.field public static final enum f:Lo/fra;

.field public static final enum g:Lo/fra;

.field public static final enum h:Lo/fra;

.field public static final enum i:Lo/fra;

.field public static final enum k:Lo/fra;

.field private static final synthetic n:[Lo/fra;

.field public static final enum o:Lo/fra;


# instance fields
.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 25
    new-instance v0, Lo/fra;

    const-string v1, "HELLO_REQUEST"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fra;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fra;->b:Lo/fra;

    new-instance v0, Lo/fra;

    const-string v1, "CLIENT_HELLO"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/fra;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fra;->c:Lo/fra;

    new-instance v0, Lo/fra;

    const-string v1, "SERVER_HELLO"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/fra;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fra;->d:Lo/fra;

    new-instance v0, Lo/fra;

    const-string v1, "HELLO_VERIFY_REQUEST"

    const/4 v2, 0x3

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lo/fra;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fra;->a:Lo/fra;

    .line 26
    new-instance v0, Lo/fra;

    const-string v1, "CERTIFICATE"

    const/4 v2, 0x4

    const/16 v3, 0xb

    invoke-direct {v0, v1, v2, v3}, Lo/fra;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fra;->e:Lo/fra;

    new-instance v0, Lo/fra;

    const-string v1, "SERVER_KEY_EXCHANGE"

    const/4 v2, 0x5

    const/16 v3, 0xc

    invoke-direct {v0, v1, v2, v3}, Lo/fra;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fra;->i:Lo/fra;

    new-instance v0, Lo/fra;

    const-string v1, "CERTIFICATE_REQUEST"

    const/4 v2, 0x6

    const/16 v3, 0xd

    invoke-direct {v0, v1, v2, v3}, Lo/fra;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fra;->k:Lo/fra;

    new-instance v0, Lo/fra;

    const-string v1, "SERVER_HELLO_DONE"

    const/4 v2, 0x7

    const/16 v3, 0xe

    invoke-direct {v0, v1, v2, v3}, Lo/fra;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fra;->g:Lo/fra;

    .line 27
    new-instance v0, Lo/fra;

    const-string v1, "CERTIFICATE_VERIFY"

    const/16 v2, 0x8

    const/16 v3, 0xf

    invoke-direct {v0, v1, v2, v3}, Lo/fra;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fra;->f:Lo/fra;

    new-instance v0, Lo/fra;

    const-string v1, "CLIENT_KEY_EXCHANGE"

    const/16 v2, 0x9

    const/16 v3, 0x10

    invoke-direct {v0, v1, v2, v3}, Lo/fra;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fra;->h:Lo/fra;

    new-instance v0, Lo/fra;

    const-string v1, "FINISHED"

    const/16 v2, 0xa

    const/16 v3, 0x14

    invoke-direct {v0, v1, v2, v3}, Lo/fra;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fra;->o:Lo/fra;

    .line 24
    const/16 v0, 0xb

    new-array v0, v0, [Lo/fra;

    sget-object v1, Lo/fra;->b:Lo/fra;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fra;->c:Lo/fra;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fra;->d:Lo/fra;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fra;->a:Lo/fra;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/fra;->e:Lo/fra;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/fra;->i:Lo/fra;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/fra;->k:Lo/fra;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/fra;->g:Lo/fra;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/fra;->f:Lo/fra;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lo/fra;->h:Lo/fra;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lo/fra;->o:Lo/fra;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sput-object v0, Lo/fra;->n:[Lo/fra;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 32
    iput p3, p0, Lo/fra;->l:I

    .line 33
    return-void
.end method

.method public static d(I)Lo/fra;
    .locals 5

    .line 40
    invoke-static {}, Lo/fra;->values()[Lo/fra;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 41
    iget v0, v4, Lo/fra;->l:I

    if-ne v0, p0, :cond_0

    .line 42
    return-object v4

    .line 40
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 45
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fra;
    .locals 1

    .line 24
    const-class v0, Lo/fra;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fra;

    return-object v0
.end method

.method public static values()[Lo/fra;
    .locals 1

    .line 24
    sget-object v0, Lo/fra;->n:[Lo/fra;

    invoke-virtual {v0}, [Lo/fra;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fra;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 36
    iget v0, p0, Lo/fra;->l:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lo/fra;->name()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fra;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
