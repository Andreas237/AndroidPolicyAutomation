.class final enum Lcom/squareup/leakcanary/AndroidExcludedRefs$26;
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

    .line 380
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/squareup/leakcanary/AndroidExcludedRefs;-><init>(Ljava/lang/String;IZLcom/squareup/leakcanary/AndroidExcludedRefs$1;)V

    return-void
.end method


# virtual methods
.method add(Lcom/squareup/leakcanary/ExcludedRefs$Builder;)V
    .locals 2

    .line 383
    const-string v0, "android.widget.TextView"

    const-string v1, "mLastHoveredView"

    invoke-interface {p1, v0, v1}, Lcom/squareup/leakcanary/ExcludedRefs$Builder;->staticField(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;

    move-result-object v0

    const-string v1, "mLastHoveredView is a static field in TextView that leaks the last hovered view."

    .line 384
    invoke-virtual {v0, v1}, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->reason(Ljava/lang/String;)Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;

    .line 386
    return-void
.end method
