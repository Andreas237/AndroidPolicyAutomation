.class Lorg/threeten/bp/format/DateTimeTextProvider$ProviderSingleton;
.super Ljava/lang/Object;
.source "DateTimeTextProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/threeten/bp/format/DateTimeTextProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ProviderSingleton"
.end annotation


# static fields
.field static final PROVIDER:Lorg/threeten/bp/format/DateTimeTextProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 118
    invoke-static {}, Lorg/threeten/bp/format/DateTimeTextProvider$ProviderSingleton;->initialize()Lorg/threeten/bp/format/DateTimeTextProvider;

    move-result-object v0

    sput-object v0, Lorg/threeten/bp/format/DateTimeTextProvider$ProviderSingleton;->PROVIDER:Lorg/threeten/bp/format/DateTimeTextProvider;

    return-void
.end method

.method static initialize()Lorg/threeten/bp/format/DateTimeTextProvider;
    .locals 3

    .line 123
    invoke-static {}, Lorg/threeten/bp/format/DateTimeTextProvider;->access$000()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    new-instance v1, Lorg/threeten/bp/format/SimpleDateTimeTextProvider;

    invoke-direct {v1}, Lorg/threeten/bp/format/SimpleDateTimeTextProvider;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    invoke-static {}, Lorg/threeten/bp/format/DateTimeTextProvider;->access$000()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/threeten/bp/format/DateTimeTextProvider;

    return-object v0
.end method
