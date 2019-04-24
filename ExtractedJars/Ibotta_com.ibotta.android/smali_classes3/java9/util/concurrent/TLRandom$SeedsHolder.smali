.class final Ljava9/util/concurrent/TLRandom$SeedsHolder;
.super Ljava/lang/Object;
.source "TLRandom.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/concurrent/TLRandom;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SeedsHolder"
.end annotation


# instance fields
.field threadProbe:I

.field threadSecondarySeed:I

.field threadSeed:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ljava9/util/concurrent/TLRandom$1;)V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava9/util/concurrent/TLRandom$SeedsHolder;-><init>()V

    return-void
.end method
