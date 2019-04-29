.class final Lcom/yandex/metrica/impl/ob/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field private static final a:Lcom/yandex/metrica/impl/ob/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 67
    new-instance v0, Lcom/yandex/metrica/impl/ob/h;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/h;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/ob/h$b;->a:Lcom/yandex/metrica/impl/ob/h;

    return-void
.end method

.method static synthetic a()Lcom/yandex/metrica/impl/ob/h;
    .locals 1

    .line 66
    sget-object v0, Lcom/yandex/metrica/impl/ob/h$b;->a:Lcom/yandex/metrica/impl/ob/h;

    return-object v0
.end method
