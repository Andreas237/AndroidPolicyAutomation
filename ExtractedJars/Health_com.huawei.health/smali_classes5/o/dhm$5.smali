.class final Lo/dhm$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dhm;->c(Ljava/util/List;)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Ljava/lang/Float;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 142
    move-object v0, p1

    check-cast v0, Ljava/lang/Float;

    move-object v1, p2

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {p0, v0, v1}, Lo/dhm$5;->d(Ljava/lang/Float;Ljava/lang/Float;)I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/Float;Ljava/lang/Float;)I
    .locals 2

    .line 145
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 146
    const/4 v0, -0x1

    return v0

    .line 149
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
