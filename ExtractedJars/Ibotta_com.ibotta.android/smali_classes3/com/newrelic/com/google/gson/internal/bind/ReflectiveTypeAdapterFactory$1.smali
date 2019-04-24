.class Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;
.super Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
.source "ReflectiveTypeAdapterFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->createBoundField(Lcom/newrelic/com/google/gson/Gson;Ljava/lang/reflect/Field;Ljava/lang/String;Lcom/newrelic/com/google/gson/reflect/TypeToken;ZZ)Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory;

.field final typeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/newrelic/com/google/gson/TypeAdapter<",
            "*>;"
        }
    .end annotation
.end field

.field final synthetic val$context:Lcom/newrelic/com/google/gson/Gson;

.field final synthetic val$field:Ljava/lang/reflect/Field;

.field final synthetic val$fieldType:Lcom/newrelic/com/google/gson/reflect/TypeToken;

.field final synthetic val$isPrimitive:Z


# direct methods
.method constructor <init>(Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory;Ljava/lang/String;ZZLcom/newrelic/com/google/gson/Gson;Lcom/newrelic/com/google/gson/reflect/TypeToken;Ljava/lang/reflect/Field;Z)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->this$0:Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory;

    iput-object p5, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$context:Lcom/newrelic/com/google/gson/Gson;

    iput-object p6, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$fieldType:Lcom/newrelic/com/google/gson/reflect/TypeToken;

    iput-object p7, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$field:Ljava/lang/reflect/Field;

    iput-boolean p8, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$isPrimitive:Z

    invoke-direct {p0, p2, p3, p4}, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;-><init>(Ljava/lang/String;ZZ)V

    .line 82
    iget-object p1, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$context:Lcom/newrelic/com/google/gson/Gson;

    iget-object p2, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$fieldType:Lcom/newrelic/com/google/gson/reflect/TypeToken;

    invoke-virtual {p1, p2}, Lcom/newrelic/com/google/gson/Gson;->getAdapter(Lcom/newrelic/com/google/gson/reflect/TypeToken;)Lcom/newrelic/com/google/gson/TypeAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->typeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    return-void
.end method


# virtual methods
.method read(Lcom/newrelic/com/google/gson/stream/JsonReader;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->typeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-virtual {v0, p1}, Lcom/newrelic/com/google/gson/TypeAdapter;->read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    .line 94
    iget-boolean v0, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$isPrimitive:Z

    if-nez v0, :cond_1

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$field:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$field:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 87
    new-instance v0, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;

    iget-object v1, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$context:Lcom/newrelic/com/google/gson/Gson;

    iget-object v2, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->typeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    iget-object v3, p0, Lcom/newrelic/com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;->val$fieldType:Lcom/newrelic/com/google/gson/reflect/TypeToken;

    invoke-virtual {v3}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;-><init>(Lcom/newrelic/com/google/gson/Gson;Lcom/newrelic/com/google/gson/TypeAdapter;Ljava/lang/reflect/Type;)V

    .line 89
    invoke-virtual {v0, p1, p2}, Lcom/newrelic/com/google/gson/TypeAdapter;->write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    return-void
.end method
