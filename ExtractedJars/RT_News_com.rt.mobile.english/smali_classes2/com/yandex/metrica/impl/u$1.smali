.class final Lcom/yandex/metrica/impl/u$1;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/u;->c(Landroid/content/Context;Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Landroid/content/Context;


# direct methods
.method constructor <init>(Ljava/io/File;Landroid/content/Context;)V
    .locals 0

    .line 349
    iput-object p1, p0, Lcom/yandex/metrica/impl/u$1;->a:Ljava/io/File;

    iput-object p2, p0, Lcom/yandex/metrica/impl/u$1;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string p1, "file_name"

    .line 351
    iget-object p2, p0, Lcom/yandex/metrica/impl/u$1;->a:Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/u$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "applicationId"

    .line 352
    iget-object p2, p0, Lcom/yandex/metrica/impl/u$1;->b:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/u$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
