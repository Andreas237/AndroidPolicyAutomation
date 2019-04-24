.class Lio/gsonfire/gson/HooksInvoker$HooksInvokerValueSupplier;
.super Ljava/lang/Object;
.source "HooksInvoker.java"

# interfaces
.implements Lio/gsonfire/util/reflection/MethodInvoker$ValueSupplier;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/gsonfire/gson/HooksInvoker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "HooksInvokerValueSupplier"
.end annotation


# instance fields
.field private final gson:Lcom/google/gson/Gson;

.field private final jsonElement:Lcom/google/gson/JsonElement;


# direct methods
.method private constructor <init>(Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lio/gsonfire/gson/HooksInvoker$HooksInvokerValueSupplier;->jsonElement:Lcom/google/gson/JsonElement;

    .line 67
    iput-object p2, p0, Lio/gsonfire/gson/HooksInvoker$HooksInvokerValueSupplier;->gson:Lcom/google/gson/Gson;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;Lio/gsonfire/gson/HooksInvoker$1;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2}, Lio/gsonfire/gson/HooksInvoker$HooksInvokerValueSupplier;-><init>(Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)V

    return-void
.end method


# virtual methods
.method public getValueForType(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .line 72
    const-class v0, Lcom/google/gson/JsonElement;

    if-ne p1, v0, :cond_0

    .line 73
    iget-object p1, p0, Lio/gsonfire/gson/HooksInvoker$HooksInvokerValueSupplier;->jsonElement:Lcom/google/gson/JsonElement;

    return-object p1

    .line 74
    :cond_0
    const-class v0, Lcom/google/gson/Gson;

    if-ne p1, v0, :cond_1

    .line 75
    iget-object p1, p0, Lio/gsonfire/gson/HooksInvoker$HooksInvokerValueSupplier;->gson:Lcom/google/gson/Gson;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
