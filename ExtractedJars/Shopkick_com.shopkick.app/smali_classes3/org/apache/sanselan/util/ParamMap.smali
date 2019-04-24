.class public Lorg/apache/sanselan/util/ParamMap;
.super Ljava/lang/Object;
.source "ParamMap.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getParamBoolean(Ljava/util/Map;Ljava/lang/Object;Z)Z
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    .line 29
    instance-of p1, p0, Ljava/lang/Boolean;

    if-eqz p1, :cond_1

    .line 30
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    :cond_1
    return p2
.end method
