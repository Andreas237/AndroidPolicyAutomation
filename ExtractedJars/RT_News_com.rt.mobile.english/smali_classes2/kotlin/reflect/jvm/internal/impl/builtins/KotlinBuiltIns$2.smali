.class Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$2;
.super Ljava/lang/Object;
.source "KotlinBuiltIns.java"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;


# direct methods
.method constructor <init>(Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$2;->this$0:Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 97
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$2;->invoke()Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives;
    .locals 10

    .line 100
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 101
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 102
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 103
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->values()[Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;

    move-result-object v3

    const/4 v4, 0x0

    array-length v5, v3

    :goto_0
    if-ge v4, v5, :cond_0

    aget-object v6, v3, v4

    .line 104
    iget-object v7, p0, Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$2;->this$0:Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;

    invoke-virtual {v6}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->getTypeName()Lkotlin/reflect/jvm/internal/impl/name/Name;

    move-result-object v8

    invoke-virtual {v8}, Lkotlin/reflect/jvm/internal/impl/name/Name;->asString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;->access$400(Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/SimpleType;

    move-result-object v7

    .line 105
    iget-object v8, p0, Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$2;->this$0:Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;

    invoke-virtual {v6}, Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;->getArrayTypeName()Lkotlin/reflect/jvm/internal/impl/name/Name;

    move-result-object v9

    invoke-virtual {v9}, Lkotlin/reflect/jvm/internal/impl/name/Name;->asString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;->access$400(Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/SimpleType;

    move-result-object v8

    .line 107
    invoke-interface {v0, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    invoke-interface {v1, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    invoke-interface {v2, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 111
    :cond_0
    new-instance v3, Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v2, v4}, Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$1;)V

    return-object v3
.end method
