.class public interface abstract Lcom/ibotta/android/profile/ProfileDebugStateCallback;
.super Ljava/lang/Object;
.source "ProfileDebugStateCallback.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ibotta/android/profile/ProfileDebugStateCallback;",
        "",
        "columns",
        "Lcom/ibotta/android/profile/GalleryColumns;",
        "getColumns",
        "()Lcom/ibotta/android/profile/GalleryColumns;",
        "debugApiUrl",
        "",
        "getDebugApiUrl",
        "()Ljava/lang/String;",
        "ibotta-profile_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract getColumns()Lcom/ibotta/android/profile/GalleryColumns;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getDebugApiUrl()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
