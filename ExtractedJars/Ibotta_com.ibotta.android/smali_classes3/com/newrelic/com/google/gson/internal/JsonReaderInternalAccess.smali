.class public abstract Lcom/newrelic/com/google/gson/internal/JsonReaderInternalAccess;
.super Ljava/lang/Object;
.source "JsonReaderInternalAccess.java"


# static fields
.field public static INSTANCE:Lcom/newrelic/com/google/gson/internal/JsonReaderInternalAccess;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract promoteNameToValue(Lcom/newrelic/com/google/gson/stream/JsonReader;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
