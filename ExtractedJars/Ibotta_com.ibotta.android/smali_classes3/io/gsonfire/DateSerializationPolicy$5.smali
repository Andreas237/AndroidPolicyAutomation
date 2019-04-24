.class final enum Lio/gsonfire/DateSerializationPolicy$5;
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

    .line 70
    invoke-direct {p0, p1, p2, v0}, Lio/gsonfire/DateSerializationPolicy;-><init>(Ljava/lang/String;ILio/gsonfire/DateSerializationPolicy$1;)V

    return-void
.end method


# virtual methods
.method createTypeAdapter(Ljava/util/TimeZone;)Lcom/google/gson/TypeAdapter;
    .locals 3
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

    .line 73
    new-instance v0, Lio/gsonfire/gson/NullableTypeAdapter;

    new-instance v1, Lio/gsonfire/gson/DateRFC3339TypeAdapter;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lio/gsonfire/gson/DateRFC3339TypeAdapter;-><init>(Ljava/util/TimeZone;Z)V

    invoke-direct {v0, v1}, Lio/gsonfire/gson/NullableTypeAdapter;-><init>(Lcom/google/gson/TypeAdapter;)V

    return-object v0
.end method
