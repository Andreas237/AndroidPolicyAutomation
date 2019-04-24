.class final enum Lio/gsonfire/DateSerializationPolicy$1;
.super Lio/gsonfire/DateSerializationPolicy;
.source "DateSerializationPolicy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/gsonfire/DateSerializationPolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, p2, v0}, Lio/gsonfire/DateSerializationPolicy;-><init>(Ljava/lang/String;ILio/gsonfire/DateSerializationPolicy$1;)V

    return-void
.end method


# virtual methods
.method createTypeAdapter(Ljava/util/TimeZone;)Lcom/google/gson/TypeAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/TimeZone;",
            ")",
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation

    .line 23
    new-instance p1, Lio/gsonfire/gson/NullableTypeAdapter;

    new-instance v0, Lio/gsonfire/gson/DateUnixtimeMillisTypeAdapter;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/gsonfire/gson/DateUnixtimeMillisTypeAdapter;-><init>(Z)V

    invoke-direct {p1, v0}, Lio/gsonfire/gson/NullableTypeAdapter;-><init>(Lcom/google/gson/TypeAdapter;)V

    return-object p1
.end method
