.class public final Lcom/microblink/internal/logo/LogoRepository;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "LogoRepository"


# instance fields
.field private service:Lcom/microblink/internal/logo/LogoService;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/internal/logo/LogoServiceImpl;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/microblink/internal/logo/LogoServiceImpl;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/microblink/internal/logo/LogoRepository;-><init>(Lcom/microblink/internal/logo/LogoService;)V

    return-void
.end method

.method private constructor <init>(Lcom/microblink/internal/logo/LogoService;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/logo/LogoService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/logo/LogoRepository;->service:Lcom/microblink/internal/logo/LogoService;

    return-void
.end method


# virtual methods
.method public final bannerId(Lcom/microblink/StringType;)I
    .locals 1
    .param p1    # Lcom/microblink/StringType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/logo/LogoRepository;->service:Lcom/microblink/internal/logo/LogoService;

    invoke-static {p1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/microblink/internal/logo/LogoService;->bannerId(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final friendlyName(Lcom/microblink/StringType;)Lcom/microblink/StringType;
    .locals 2
    .param p1    # Lcom/microblink/StringType;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    invoke-static {p1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/microblink/internal/logo/LogoRepository;->service:Lcom/microblink/internal/logo/LogoService;

    invoke-interface {v1, v0}, Lcom/microblink/internal/logo/LogoService;->friendlyName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lcom/microblink/StringType;->confidence()F

    move-result p1

    invoke-static {v0, p1}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final logo(Landroid/graphics/Bitmap;)Lcom/microblink/StringType;
    .locals 2
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/logo/LogoRepository;->service:Lcom/microblink/internal/logo/LogoService;

    invoke-interface {v0, p1}, Lcom/microblink/internal/logo/LogoService;->logo(Landroid/graphics/Bitmap;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/microblink/internal/Utility;->getFirst(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/LogoResult;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/microblink/StringType;

    iget-object v1, p1, Lcom/microblink/internal/LogoResult;->merchant:Ljava/lang/String;

    iget p1, p1, Lcom/microblink/internal/LogoResult;->score:F

    invoke-direct {v0, v1, p1}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    const-string v0, "LogoRepository"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final logo(Ljava/io/File;)Lcom/microblink/StringType;
    .locals 2
    .param p1    # Ljava/io/File;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/microblink/internal/logo/LogoRepository;->logo(Landroid/graphics/Bitmap;)Lcom/microblink/StringType;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "LogoRepository"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method
