.class final enum Lcom/squareup/leakcanary/AndroidExcludedRefs$13;
.super Lcom/squareup/leakcanary/AndroidExcludedRefs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/leakcanary/AndroidExcludedRefs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;IZ)V
    .locals 1

    .line 227
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/squareup/leakcanary/AndroidExcludedRefs;-><init>(Ljava/lang/String;IZLcom/squareup/leakcanary/AndroidExcludedRefs$1;)V

    return-void
.end method


# virtual methods
.method add(Lcom/squareup/leakcanary/ExcludedRefs$Builder;)V
    .locals 2

    .line 229
    const-string v0, "android.media.MediaScannerConnection"

    const-string v1, "mContext"

    invoke-interface {p1, v0, v1}, Lcom/squareup/leakcanary/ExcludedRefs$Builder;->instanceField(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;

    move-result-object v0

    const-string v1, "The static method MediaScannerConnection.scanFile() takes an activity context but the service might not disconnect after the activity has been destroyed. Tracked here: https://code.google.com/p/android/issues/detail?id=173788 Fix: Create an instance of MediaScannerConnection yourself and pass in the application context. Call connect() and disconnect() manually."

    .line 230
    invoke-virtual {v0, v1}, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->reason(Ljava/lang/String;)Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;

    .line 235
    return-void
.end method
