.class public Lcom/ibotta/android/tracking/proprietary/TrackingData;
.super Ljava/lang/Object;
.source "TrackingData.java"


# annotations
.annotation build Landroid/arch/persistence/room/Entity;
.end annotation


# instance fields
.field public final data:Lcom/ibotta/tracking/generated/model/Body;

.field public final primaryKey:Ljava/lang/String;
    .annotation build Landroid/arch/persistence/room/PrimaryKey;
    .end annotation

    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/tracking/generated/model/Body;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/TrackingData;->primaryKey:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/TrackingData;->data:Lcom/ibotta/tracking/generated/model/Body;

    return-void
.end method
