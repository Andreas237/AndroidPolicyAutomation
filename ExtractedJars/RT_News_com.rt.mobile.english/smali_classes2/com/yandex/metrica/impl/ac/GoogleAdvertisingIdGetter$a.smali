.class public Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;->a:Ljava/lang/String;

    .line 54
    iput-object p2, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;->b:Ljava/lang/Boolean;

    return-void
.end method
