.class Lo/dxd$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dxd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lorg/json/JSONObject;>;Ljava/io/Serializable;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/dxd$1;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lo/dxd$a;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 103
    move-object v0, p1

    check-cast v0, Lorg/json/JSONObject;

    move-object v1, p2

    check-cast v1, Lorg/json/JSONObject;

    invoke-virtual {p0, v0, v1}, Lo/dxd$a;->e(Lorg/json/JSONObject;Lorg/json/JSONObject;)I

    move-result v0

    return v0
.end method

.method public e(Lorg/json/JSONObject;Lorg/json/JSONObject;)I
    .locals 4

    .line 107
    invoke-static {p1}, Lo/dxd;->c(Lorg/json/JSONObject;)D

    move-result-wide v0

    invoke-static {p2}, Lo/dxd;->c(Lorg/json/JSONObject;)D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    return v0
.end method
