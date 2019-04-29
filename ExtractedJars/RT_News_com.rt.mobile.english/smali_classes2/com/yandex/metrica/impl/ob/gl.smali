.class public abstract Lcom/yandex/metrica/impl/ob/gl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/gl$b;,
        Lcom/yandex/metrica/impl/ob/gl$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a(Landroid/content/pm/FeatureInfo;)Lcom/yandex/metrica/impl/ob/gm;
.end method

.method public b(Landroid/content/pm/FeatureInfo;)Lcom/yandex/metrica/impl/ob/gm;
    .locals 3
    .param p1    # Landroid/content/pm/FeatureInfo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 23
    iget-object v0, p1, Landroid/content/pm/FeatureInfo;->name:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 24
    iget v0, p1, Landroid/content/pm/FeatureInfo;->reqGlEsVersion:I

    if-nez v0, :cond_0

    .line 25
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/gl;->a(Landroid/content/pm/FeatureInfo;)Lcom/yandex/metrica/impl/ob/gm;

    move-result-object p1

    return-object p1

    .line 27
    :cond_0
    new-instance v0, Lcom/yandex/metrica/impl/ob/gm;

    const-string v1, "openGlFeature"

    iget v2, p1, Landroid/content/pm/FeatureInfo;->reqGlEsVersion:I

    .line 30
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/gl;->c(Landroid/content/pm/FeatureInfo;)Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lcom/yandex/metrica/impl/ob/gm;-><init>(Ljava/lang/String;IZ)V

    return-object v0

    .line 34
    :cond_1
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/gl;->a(Landroid/content/pm/FeatureInfo;)Lcom/yandex/metrica/impl/ob/gm;

    move-result-object p1

    return-object p1
.end method

.method c(Landroid/content/pm/FeatureInfo;)Z
    .locals 1

    .line 39
    iget p1, p1, Landroid/content/pm/FeatureInfo;->flags:I

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
