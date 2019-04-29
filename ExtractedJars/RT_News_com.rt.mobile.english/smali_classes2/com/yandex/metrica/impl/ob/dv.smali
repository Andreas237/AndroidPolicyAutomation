.class public Lcom/yandex/metrica/impl/ob/dv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ed;


# instance fields
.field private final a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Landroid/app/AlarmManager;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/ma;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "alarm"

    .line 39
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    new-instance v1, Lcom/yandex/metrica/impl/ob/lz;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/lz;-><init>()V

    .line 37
    invoke-direct {p0, p1, v0, v1}, Lcom/yandex/metrica/impl/ob/dv;-><init>(Landroid/content/Context;Landroid/app/AlarmManager;Lcom/yandex/metrica/impl/ob/ma;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/app/AlarmManager;Lcom/yandex/metrica/impl/ob/ma;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/app/AlarmManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ma;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dv;->a:Landroid/content/Context;

    .line 74
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/dv;->b:Landroid/app/AlarmManager;

    .line 75
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/dv;->c:Lcom/yandex/metrica/impl/ob/ma;

    return-void
.end method

.method private static a(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 1066
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/yandex/metrica/ConfigurationService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "com.yandex.metrica.configuration.ACTION_SCHEDULED_START"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const v1, 0x756c4b

    const/high16 v2, 0x8000000

    .line 60
    invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dv;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/dv;->a(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v0

    .line 55
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/dv;->b:Landroid/app/AlarmManager;

    invoke-virtual {v1, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public a(J)V
    .locals 8

    .line 47
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dv;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/dv;->a(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v7

    .line 48
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/dv;->b:Landroid/app/AlarmManager;

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dv;->c:Lcom/yandex/metrica/impl/ob/ma;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/ma;->b()J

    move-result-wide v3

    const/4 v2, 0x3

    move-wide v5, p1

    invoke-virtual/range {v1 .. v7}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V

    return-void
.end method
