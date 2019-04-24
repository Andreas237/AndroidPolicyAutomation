.class final Lcom/microblink/internal/logo/LogoServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/logo/LogoService;


# static fields
.field private static final TAG:Ljava/lang/String; = "LogoServiceImpl"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/logo/LogoServiceImpl;->context:Landroid/content/Context;

    invoke-static {p1}, Lcom/microblink/internal/LogoCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/LogoCsvManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/internal/LogoCsvManager;->has()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/microblink/internal/LogoCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/LogoCsvManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/internal/LogoCsvManager;->parse()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final bannerId(Ljava/lang/String;)I
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/logo/LogoServiceImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/microblink/internal/LogoCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/LogoCsvManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/microblink/internal/LogoCsvManager;->bannerId(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final friendlyName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/logo/LogoServiceImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/microblink/internal/LogoCsvManager;->getInstance(Landroid/content/Context;)Lcom/microblink/internal/LogoCsvManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/microblink/internal/LogoCsvManager;->friendlyName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final logo(Landroid/graphics/Bitmap;)Ljava/util/ArrayList;
    .locals 3
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/microblink/internal/LogoResult;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/microblink/RecognizerException;
        }
    .end annotation

    :try_start_0
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/microblink/Recognizer;->recognizeLogo(Landroid/graphics/Bitmap;)Ljava/util/ArrayList;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "LogoServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    new-array p1, v1, [Lcom/microblink/internal/LogoResult;

    invoke-static {p1}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
