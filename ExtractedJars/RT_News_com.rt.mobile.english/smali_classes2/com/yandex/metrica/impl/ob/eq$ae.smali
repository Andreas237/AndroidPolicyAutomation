.class public final Lcom/yandex/metrica/impl/ob/eq$ae;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/eq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ae"
.end annotation


# static fields
.field public static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    .line 397
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "name"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "granted"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/yandex/metrica/impl/ob/eq$ae;->a:[Ljava/lang/String;

    return-void
.end method
