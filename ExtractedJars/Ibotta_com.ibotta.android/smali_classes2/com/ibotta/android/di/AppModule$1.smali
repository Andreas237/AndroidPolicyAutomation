.class Lcom/ibotta/android/di/AppModule$1;
.super Ljava/lang/Object;
.source "AppModule.java"

# interfaces
.implements Lcom/ibotta/android/profile/ProfileDebugStateCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/di/AppModule;->provideProfileDebugStateCallback(Lcom/ibotta/android/state/app/debug/DebugState;)Lcom/ibotta/android/profile/ProfileDebugStateCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$debugState:Lcom/ibotta/android/state/app/debug/DebugState;


# direct methods
.method constructor <init>(Lcom/ibotta/android/state/app/debug/DebugState;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/ibotta/android/di/AppModule$1;->val$debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getColumns()Lcom/ibotta/android/profile/GalleryColumns;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule$1;->val$debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/debug/DebugState;->getColumns()Lcom/ibotta/android/profile/GalleryColumns;

    move-result-object v0

    return-object v0
.end method

.method public getDebugApiUrl()Ljava/lang/String;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/di/AppModule$1;->val$debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/debug/DebugState;->getDebugApiUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
