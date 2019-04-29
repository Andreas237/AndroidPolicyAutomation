.class public final synthetic Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererImpl$RenderDeclarationDescriptorVisitor$WhenMappings;
.super Ljava/lang/Object;


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 5

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/renderer/PropertyAccessorRenderingPolicy;->values()[Lkotlin/reflect/jvm/internal/impl/renderer/PropertyAccessorRenderingPolicy;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x3

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererImpl$RenderDeclarationDescriptorVisitor$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererImpl$RenderDeclarationDescriptorVisitor$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/renderer/PropertyAccessorRenderingPolicy;->PRETTY:Lkotlin/reflect/jvm/internal/impl/renderer/PropertyAccessorRenderingPolicy;

    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/renderer/PropertyAccessorRenderingPolicy;->ordinal()I

    move-result v4

    aput v1, v0, v4

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererImpl$RenderDeclarationDescriptorVisitor$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/PropertyAccessorRenderingPolicy;->DEBUG:Lkotlin/reflect/jvm/internal/impl/renderer/PropertyAccessorRenderingPolicy;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/renderer/PropertyAccessorRenderingPolicy;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererImpl$RenderDeclarationDescriptorVisitor$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/PropertyAccessorRenderingPolicy;->NONE:Lkotlin/reflect/jvm/internal/impl/renderer/PropertyAccessorRenderingPolicy;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/renderer/PropertyAccessorRenderingPolicy;->ordinal()I

    move-result v1

    aput v3, v0, v1

    return-void
.end method
