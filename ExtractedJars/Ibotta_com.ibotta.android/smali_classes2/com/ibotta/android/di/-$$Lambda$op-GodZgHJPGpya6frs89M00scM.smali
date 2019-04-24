.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/abstractions/CurrentTimeSupplier;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;

    invoke-direct {v0}, Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$op-GodZgHJPGpya6frs89M00scM;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
