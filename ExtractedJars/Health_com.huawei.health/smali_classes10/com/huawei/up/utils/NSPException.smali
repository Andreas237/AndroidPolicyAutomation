.class public Lcom/huawei/up/utils/NSPException;
.super Ljava/lang/Exception;
.source "SourceFile"


# static fields
.field public static final EXP_JSON_SERIALIZE_ERROR:I = 0x5

.field public static final EXP_NET_ERROR:I = 0x6

.field public static final EXP_NET_ERROR_STR:Ljava/lang/String; = "Service unavailable.6"

.field public static final EXP_PHP_SERIALIZE_ERROR:I = 0x3

.field public static final EXP_PHP_UNSERIALIZE_ERROR:I = 0x4

.field public static final EXP_SERVICE_UNAVAILABLE:I = 0x2

.field public static final EXP_UNKNOWN_ERROR:I = 0x1


# instance fields
.field private exceptionCode:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 2

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 18
    iput p1, p0, Lcom/huawei/up/utils/NSPException;->exceptionCode:I

    .line 19
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    iput p1, p0, Lcom/huawei/up/utils/NSPException;->exceptionCode:I

    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 28
    return-void
.end method


# virtual methods
.method public getCode()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/up/utils/NSPException;->exceptionCode:I

    return v0
.end method
