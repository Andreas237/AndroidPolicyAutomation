.class public final Lcom/yandex/metrica/impl/bs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Ljava/lang/IllegalStateException;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "YandexMetrica isn\'t initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/bs;->a:Ljava/lang/IllegalStateException;

    return-void
.end method
