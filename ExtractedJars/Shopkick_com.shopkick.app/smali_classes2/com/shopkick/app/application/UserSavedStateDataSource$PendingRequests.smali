.class public Lcom/shopkick/app/application/UserSavedStateDataSource$PendingRequests;
.super Ljava/lang/Object;
.source "UserSavedStateDataSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/UserSavedStateDataSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PendingRequests"
.end annotation


# instance fields
.field public inFlightRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

.field public queuedRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
