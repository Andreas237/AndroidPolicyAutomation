.class final Lcom/microblink/internal/services/amazon/AmazonServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/amazon/AmazonService;


# static fields
.field private static final EMPTY_HTML:Ljava/lang/String; = ""

.field private static final EMPTY_JS:Lcom/microblink/internal/services/amazon/AmazonJavaScript;

.field private static final HOST:Ljava/lang/String; = "https://scan.blinkreceipt.com/remotejs.php"

.field private static final TAG:Ljava/lang/String; = "AmazonServiceImpl"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/amazon/AmazonJavaScript;

    invoke-direct {v0}, Lcom/microblink/internal/services/amazon/AmazonJavaScript;-><init>()V

    sput-object v0, Lcom/microblink/internal/services/amazon/AmazonServiceImpl;->EMPTY_JS:Lcom/microblink/internal/services/amazon/AmazonJavaScript;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Lcom/microblink/internal/services/amazon/AmazonJavaScript;
    .locals 1

    sget-object v0, Lcom/microblink/internal/services/amazon/AmazonServiceImpl;->EMPTY_JS:Lcom/microblink/internal/services/amazon/AmazonJavaScript;

    return-object v0
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    return-void
.end method

.method public final html(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-class v0, Lcom/microblink/internal/services/amazon/AmazonRemoteService;

    invoke-static {v0}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/amazon/AmazonRemoteService;

    invoke-interface {v0, p1}, Lcom/microblink/internal/services/amazon/AmazonRemoteService;->html(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/microblink/internal/services/amazon/AmazonServiceImpl$1;

    invoke-direct {v0, p0, p2}, Lcom/microblink/internal/services/amazon/AmazonServiceImpl$1;-><init>(Lcom/microblink/internal/services/amazon/AmazonServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "AmazonServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, ""

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public final js(ILcom/microblink/OnCompleteListener;)V
    .locals 2
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/amazon/AmazonJavaScript;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/microblink/internal/services/amazon/AmazonServiceImpl;->cancel()V

    const-class v0, Lcom/microblink/internal/services/amazon/AmazonRemoteService;

    invoke-static {v0}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/amazon/AmazonRemoteService;

    const-string v1, "https://scan.blinkreceipt.com/remotejs.php"

    invoke-interface {v0, v1, p1}, Lcom/microblink/internal/services/amazon/AmazonRemoteService;->scrape(Ljava/lang/String;I)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/microblink/internal/services/amazon/AmazonServiceImpl$2;

    invoke-direct {v0, p0, p2}, Lcom/microblink/internal/services/amazon/AmazonServiceImpl$2;-><init>(Lcom/microblink/internal/services/amazon/AmazonServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "AmazonServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/amazon/AmazonServiceImpl;->EMPTY_JS:Lcom/microblink/internal/services/amazon/AmazonJavaScript;

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
