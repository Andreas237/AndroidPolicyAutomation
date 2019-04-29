.class final Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;
.super Lkotlin/jvm/internal/Lambda;
.source "InlineClassAwareCaller.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/CallerImpl;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInlineClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 IntrinsicArrayConstructors.kt\norg/jetbrains/kotlin/codegen/intrinsics/IntrinsicArrayConstructorsKt\n*L\n1#1,139:1\n1288#2:140\n1357#2,3:141\n42#3,5:144\n*E\n*S KotlinDebug\n*F\n+ 1 InlineClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2\n*L\n60#1:140\n60#1,3:141\n75#1,5:144\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\u0008\u0000\u0010\u0002 \u0001*\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;",
        "M",
        "Ljava/lang/reflect/Member;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;


# direct methods
.method constructor <init>(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;)V
    .locals 0

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->invoke()Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 47
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$getCaller$p(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;)Lkotlin/reflect/jvm/internal/calls/CallerImpl;

    move-result-object v0

    instance-of v0, v0, Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$getDescriptor$p(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;)Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;->getDispatchReceiverParameter()Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$getCaller$p(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;)Lkotlin/reflect/jvm/internal/calls/CallerImpl;

    move-result-object v0

    instance-of v0, v0, Lkotlin/reflect/jvm/internal/calls/BoundCaller;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 56
    :goto_0
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v2}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$isDefault$p(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x2

    goto :goto_1

    :cond_2
    move v2, v1

    .line 59
    :goto_1
    iget-object v3, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v3}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$getDescriptor$p(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;)Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;

    move-result-object v3

    invoke-interface {v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;->getExtensionReceiverParameter()Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;->getType()Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    move-result-object v3

    goto :goto_2

    :cond_3
    move-object v3, v4

    :goto_2
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    .line 60
    iget-object v5, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v5}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$getDescriptor$p(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;)Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;

    move-result-object v5

    invoke-interface {v5}, Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;->getValueParameters()Ljava/util/List;

    move-result-object v5

    const-string v6, "descriptor.valueParameters"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    .line 140
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 141
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 142
    check-cast v8, Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;

    .line 60
    invoke-interface {v8}, Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;->getType()Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 143
    :cond_4
    check-cast v6, Ljava/util/List;

    check-cast v6, Ljava/lang/Iterable;

    .line 59
    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    .line 61
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    add-int/2addr v5, v0

    add-int/2addr v5, v2

    .line 62
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v2}, Lkotlin/reflect/jvm/internal/calls/CallerKt;->getArity(Lkotlin/reflect/jvm/internal/calls/Caller;)I

    move-result v2

    if-eq v2, v5, :cond_5

    .line 63
    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistent number of parameters in the descriptor and Java reflection object: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v2}, Lkotlin/reflect/jvm/internal/calls/CallerKt;->getArity(Lkotlin/reflect/jvm/internal/calls/Caller;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " != "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "Calling: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v2}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$getDescriptor$p(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;)Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "Parameter types: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->getParameterTypes()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ")\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Default: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v2}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$isDefault$p(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 63
    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 73
    :cond_5
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    add-int/2addr v6, v0

    invoke-static {v2, v6}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v2

    .line 144
    new-array v5, v5, [Ljava/lang/reflect/Method;

    .line 145
    array-length v6, v5

    :goto_4
    if-ge v1, v6, :cond_7

    .line 76
    invoke-virtual {v2, v1}, Lkotlin/ranges/IntRange;->contains(I)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 77
    iget-object v7, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    sub-int v8, v1, v0

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "kotlinParameterTypes[i - shift]"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    invoke-static {v7, v8}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$toInlineClass(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Ljava/lang/Class;

    move-result-object v7

    if-eqz v7, :cond_6

    iget-object v8, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v8, v7}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$getUnboxMethod(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    goto :goto_5

    :cond_6
    move-object v7, v4

    .line 78
    :goto_5
    aput-object v7, v5, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 81
    :cond_7
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$getDescriptor$p(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;)Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;->getReturnType()Lkotlin/reflect/jvm/internal/impl/types/KotlinType;

    move-result-object v1

    if-nez v1, :cond_8

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_8
    const-string v3, "descriptor.returnType!!"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$toInlineClass(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$data$2;->this$0:Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;

    invoke-static {v1, v0}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;->access$getBoxMethod(Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 83
    :cond_9
    new-instance v0, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;

    invoke-direct {v0, v2, v5, v4}, Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;-><init>(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    return-object v0
.end method
