.class public final Lcom/microblink/internal/services/walmart/WalmartRepository;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String; = "WalmartRepository"


# instance fields
.field private service:Lcom/microblink/internal/services/walmart/WalmartService;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/walmart/WalmartServiceImpl;

    invoke-direct {v0}, Lcom/microblink/internal/services/walmart/WalmartServiceImpl;-><init>()V

    invoke-direct {p0, v0}, Lcom/microblink/internal/services/walmart/WalmartRepository;-><init>(Lcom/microblink/internal/services/walmart/WalmartService;)V

    return-void
.end method

.method private constructor <init>(Lcom/microblink/internal/services/walmart/WalmartService;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/walmart/WalmartService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/walmart/WalmartRepository;->service:Lcom/microblink/internal/services/walmart/WalmartService;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/internal/services/walmart/WalmartRepository;Landroid/net/Uri;)[Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/internal/services/walmart/WalmartRepository;->uri(Landroid/net/Uri;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/internal/services/walmart/WalmartRepository;)Lcom/microblink/internal/services/walmart/WalmartService;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/services/walmart/WalmartRepository;->service:Lcom/microblink/internal/services/walmart/WalmartService;

    return-object p0
.end method

.method private uri(Landroid/net/Uri;)[Ljava/lang/String;
    .locals 5
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\\s"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/4 v3, 0x1

    const/16 v4, 0xc

    invoke-virtual {p1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v3

    const/4 v2, 0x2

    const/16 v3, 0x10

    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v2

    const/4 v2, 0x3

    const/16 v4, 0x14

    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    const/4 v2, 0x4

    invoke-virtual {p1, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v2

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final download(Landroid/net/Uri;Lcom/microblink/OnNullableCompleteListener;)V
    .locals 2
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnNullableCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lcom/microblink/OnNullableCompleteListener<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/walmart/WalmartRepository;->service:Lcom/microblink/internal/services/walmart/WalmartService;

    new-instance v1, Lcom/microblink/internal/services/walmart/WalmartRepository$1;

    invoke-direct {v1, p0, p2, p1}, Lcom/microblink/internal/services/walmart/WalmartRepository$1;-><init>(Lcom/microblink/internal/services/walmart/WalmartRepository;Lcom/microblink/OnNullableCompleteListener;Landroid/net/Uri;)V

    invoke-interface {v0, p1, v1}, Lcom/microblink/internal/services/walmart/WalmartService;->downloadFromBlink(Landroid/net/Uri;Lcom/microblink/OnNullableCompleteListener;)V

    return-void
.end method
