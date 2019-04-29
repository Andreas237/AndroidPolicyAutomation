.class Lcom/yandex/metrica/ConfigurationJobService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ee;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/ConfigurationJobService;->onStartJob(Landroid/app/job/JobParameters;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/job/JobParameters;

.field final synthetic b:Lcom/yandex/metrica/ConfigurationJobService;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/ConfigurationJobService;Landroid/app/job/JobParameters;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/yandex/metrica/ConfigurationJobService$1;->b:Lcom/yandex/metrica/ConfigurationJobService;

    iput-object p2, p0, Lcom/yandex/metrica/ConfigurationJobService$1;->a:Landroid/app/job/JobParameters;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 66
    iget-object v0, p0, Lcom/yandex/metrica/ConfigurationJobService$1;->b:Lcom/yandex/metrica/ConfigurationJobService;

    iget-object v1, p0, Lcom/yandex/metrica/ConfigurationJobService$1;->a:Landroid/app/job/JobParameters;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/ConfigurationJobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    return-void
.end method
