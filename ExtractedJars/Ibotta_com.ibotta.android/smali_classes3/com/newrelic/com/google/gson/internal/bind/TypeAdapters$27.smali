.class final Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$27;
.super Ljava/lang/Object;
.source "TypeAdapters.java"

# interfaces
.implements Lcom/newrelic/com/google/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters;->newFactory(Lcom/newrelic/com/google/gson/reflect/TypeToken;Lcom/newrelic/com/google/gson/TypeAdapter;)Lcom/newrelic/com/google/gson/TypeAdapterFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$type:Lcom/newrelic/com/google/gson/reflect/TypeToken;

.field final synthetic val$typeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;


# direct methods
.method constructor <init>(Lcom/newrelic/com/google/gson/reflect/TypeToken;Lcom/newrelic/com/google/gson/TypeAdapter;)V
    .locals 0

    .line 769
    iput-object p1, p0, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$27;->val$type:Lcom/newrelic/com/google/gson/reflect/TypeToken;

    iput-object p2, p0, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$27;->val$typeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lcom/newrelic/com/google/gson/Gson;Lcom/newrelic/com/google/gson/reflect/TypeToken;)Lcom/newrelic/com/google/gson/TypeAdapter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/newrelic/com/google/gson/Gson;",
            "Lcom/newrelic/com/google/gson/reflect/TypeToken<",
            "TT;>;)",
            "Lcom/newrelic/com/google/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    .line 772
    iget-object p1, p0, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$27;->val$type:Lcom/newrelic/com/google/gson/reflect/TypeToken;

    invoke-virtual {p2, p1}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$27;->val$typeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
