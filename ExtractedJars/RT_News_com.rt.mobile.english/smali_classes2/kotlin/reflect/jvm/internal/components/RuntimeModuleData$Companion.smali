.class public final Lkotlin/reflect/jvm/internal/components/RuntimeModuleData$Companion;
.super Ljava/lang/Object;
.source "RuntimeModuleData.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData$Companion;",
        "",
        "()V",
        "create",
        "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;",
        "classLoader",
        "Ljava/lang/ClassLoader;",
        "descriptors.runtime"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/components/RuntimeModuleData$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/ClassLoader;)Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;
    .locals 38
    .param p1    # Ljava/lang/ClassLoader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "classLoader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager;

    invoke-direct {v1}, Lkotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager;-><init>()V

    .line 58
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/JvmBuiltIns;

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;

    const/4 v15, 0x0

    const/4 v14, 0x2

    const/4 v13, 0x0

    invoke-direct {v2, v1, v13, v14, v15}, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/JvmBuiltIns;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 59
    new-instance v12, Lkotlin/reflect/jvm/internal/impl/descriptors/impl/ModuleDescriptorImpl;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "<runtime module for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3e

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/reflect/jvm/internal/impl/name/Name;->special(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/name/Name;

    move-result-object v4

    const-string v3, "Name.special(\"<runtime module for $classLoader>\")"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v2

    check-cast v6, Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x38

    const/4 v11, 0x0

    move-object v3, v12

    move-object v5, v1

    invoke-direct/range {v3 .. v11}, Lkotlin/reflect/jvm/internal/impl/descriptors/impl/ModuleDescriptorImpl;-><init>(Lkotlin/reflect/jvm/internal/impl/name/Name;Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;Lkotlin/reflect/jvm/internal/impl/resolve/MultiTargetPlatform;Ljava/util/Map;Lkotlin/reflect/jvm/internal/impl/name/Name;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    new-instance v3, Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;

    invoke-direct {v3, v0}, Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;-><init>(Ljava/lang/ClassLoader;)V

    .line 62
    new-instance v11, Lkotlin/reflect/jvm/internal/impl/load/kotlin/DeserializedDescriptorResolver;

    invoke-direct {v11}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/DeserializedDescriptorResolver;-><init>()V

    .line 63
    new-instance v10, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/SingleModuleClassResolver;

    invoke-direct {v10}, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/SingleModuleClassResolver;-><init>()V

    .line 64
    new-instance v9, Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;

    invoke-direct {v9, v0}, Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;-><init>(Ljava/lang/ClassLoader;)V

    .line 65
    sget-object v8, Lkotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache;->EMPTY:Lkotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache;

    .line 66
    new-instance v7, Lkotlin/reflect/jvm/internal/impl/descriptors/NotFoundClasses;

    move-object v6, v12

    check-cast v6, Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;

    invoke-direct {v7, v1, v6}, Lkotlin/reflect/jvm/internal/impl/descriptors/NotFoundClasses;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;)V

    .line 67
    new-instance v5, Lkotlin/reflect/jvm/internal/impl/load/java/AnnotationTypeQualifierResolver;

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/utils/Jsr305State;->DISABLED:Lkotlin/reflect/jvm/internal/impl/utils/Jsr305State;

    invoke-direct {v5, v1, v4}, Lkotlin/reflect/jvm/internal/impl/load/java/AnnotationTypeQualifierResolver;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;Lkotlin/reflect/jvm/internal/impl/utils/Jsr305State;)V

    .line 68
    new-instance v4, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/JavaResolverComponents;

    .line 69
    new-instance v13, Lkotlin/reflect/jvm/internal/components/ReflectJavaClassFinder;

    invoke-direct {v13, v0}, Lkotlin/reflect/jvm/internal/components/ReflectJavaClassFinder;-><init>(Ljava/lang/ClassLoader;)V

    move-object v0, v13

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassFinder;

    move-object v13, v3

    check-cast v13, Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder;

    .line 70
    sget-object v3, Lkotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator;->DO_NOTHING:Lkotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator;

    const-string v14, "SignaturePropagator.DO_NOTHING"

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v14, Lkotlin/reflect/jvm/internal/components/RuntimeErrorReporter;->INSTANCE:Lkotlin/reflect/jvm/internal/components/RuntimeErrorReporter;

    check-cast v14, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter;

    const-string v15, "javaResolverCache"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    sget-object v15, Lkotlin/reflect/jvm/internal/impl/load/java/components/JavaPropertyInitializerEvaluator$DoNothing;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/load/java/components/JavaPropertyInitializerEvaluator$DoNothing;

    check-cast v15, Lkotlin/reflect/jvm/internal/impl/load/java/components/JavaPropertyInitializerEvaluator;

    sget-object v16, Lkotlin/reflect/jvm/internal/impl/load/java/components/SamConversionResolver$Empty;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/load/java/components/SamConversionResolver$Empty;

    check-cast v16, Lkotlin/reflect/jvm/internal/impl/load/java/components/SamConversionResolver;

    sget-object v17, Lkotlin/reflect/jvm/internal/components/RuntimeSourceElementFactory;->INSTANCE:Lkotlin/reflect/jvm/internal/components/RuntimeSourceElementFactory;

    check-cast v17, Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElementFactory;

    move-object/from16 v18, v10

    check-cast v18, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/ModuleClassResolver;

    .line 72
    move-object/from16 v19, v9

    check-cast v19, Lkotlin/reflect/jvm/internal/impl/load/kotlin/PackagePartProvider;

    sget-object v20, Lkotlin/reflect/jvm/internal/impl/descriptors/SupertypeLoopChecker$EMPTY;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/descriptors/SupertypeLoopChecker$EMPTY;

    check-cast v20, Lkotlin/reflect/jvm/internal/impl/descriptors/SupertypeLoopChecker;

    sget-object v21, Lkotlin/reflect/jvm/internal/impl/incremental/components/LookupTracker$DO_NOTHING;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/incremental/components/LookupTracker$DO_NOTHING;

    check-cast v21, Lkotlin/reflect/jvm/internal/impl/incremental/components/LookupTracker;

    move-object/from16 v25, v2

    .line 73
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/builtins/ReflectionTypes;

    invoke-direct {v2, v6, v7}, Lkotlin/reflect/jvm/internal/impl/builtins/ReflectionTypes;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/NotFoundClasses;)V

    move-object/from16 v26, v2

    .line 75
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/SignatureEnhancement;

    move-object/from16 v27, v3

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/utils/Jsr305State;->DISABLED:Lkotlin/reflect/jvm/internal/impl/utils/Jsr305State;

    invoke-direct {v2, v5, v3}, Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/SignatureEnhancement;-><init>(Lkotlin/reflect/jvm/internal/impl/load/java/AnnotationTypeQualifierResolver;Lkotlin/reflect/jvm/internal/impl/utils/Jsr305State;)V

    .line 76
    sget-object v3, Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassesTracker$Default;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassesTracker$Default;

    move-object/from16 v22, v3

    check-cast v22, Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassesTracker;

    .line 77
    sget-object v3, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/JavaResolverSettings$Default;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/load/java/lazy/JavaResolverSettings$Default;

    move-object/from16 v23, v3

    check-cast v23, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/JavaResolverSettings;

    move-object v3, v4

    move-object/from16 v28, v4

    move-object v4, v1

    move-object/from16 v29, v5

    move-object v5, v0

    move-object v0, v6

    move-object v6, v13

    move-object/from16 v30, v1

    move-object v1, v7

    move-object v7, v11

    move-object/from16 v31, v8

    move-object/from16 v8, v27

    move-object/from16 v32, v9

    move-object v9, v14

    move-object v14, v10

    move-object/from16 v10, v31

    move-object/from16 v33, v1

    move-object v1, v11

    move-object v11, v15

    move-object v15, v12

    move-object/from16 v12, v16

    move-object/from16 v34, v1

    move-object v1, v13

    const/16 v24, 0x0

    move-object/from16 v13, v17

    move-object/from16 v35, v14

    move-object/from16 v14, v18

    move-object/from16 v36, v15

    move-object/from16 v15, v19

    move-object/from16 v16, v20

    move-object/from16 v17, v21

    move-object/from16 v18, v0

    move-object/from16 v19, v26

    move-object/from16 v20, v29

    move-object/from16 v21, v2

    .line 68
    invoke-direct/range {v3 .. v23}, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/JavaResolverComponents;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassFinder;Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder;Lkotlin/reflect/jvm/internal/impl/load/kotlin/DeserializedDescriptorResolver;Lkotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator;Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter;Lkotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache;Lkotlin/reflect/jvm/internal/impl/load/java/components/JavaPropertyInitializerEvaluator;Lkotlin/reflect/jvm/internal/impl/load/java/components/SamConversionResolver;Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElementFactory;Lkotlin/reflect/jvm/internal/impl/load/java/lazy/ModuleClassResolver;Lkotlin/reflect/jvm/internal/impl/load/kotlin/PackagePartProvider;Lkotlin/reflect/jvm/internal/impl/descriptors/SupertypeLoopChecker;Lkotlin/reflect/jvm/internal/impl/incremental/components/LookupTracker;Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;Lkotlin/reflect/jvm/internal/impl/builtins/ReflectionTypes;Lkotlin/reflect/jvm/internal/impl/load/java/AnnotationTypeQualifierResolver;Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/SignatureEnhancement;Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassesTracker;Lkotlin/reflect/jvm/internal/impl/load/java/lazy/JavaResolverSettings;)V

    .line 80
    new-instance v9, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/LazyJavaPackageFragmentProvider;

    move-object/from16 v2, v28

    invoke-direct {v9, v2}, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/LazyJavaPackageFragmentProvider;-><init>(Lkotlin/reflect/jvm/internal/impl/load/java/lazy/JavaResolverComponents;)V

    const/4 v2, 0x1

    move-object/from16 v14, v25

    .line 82
    invoke-virtual {v14, v0, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/JvmBuiltIns;->initialize(Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;Z)V

    .line 84
    new-instance v15, Lkotlin/reflect/jvm/internal/impl/resolve/jvm/JavaDescriptorResolver;

    move-object/from16 v3, v31

    invoke-direct {v15, v9, v3}, Lkotlin/reflect/jvm/internal/impl/resolve/jvm/JavaDescriptorResolver;-><init>(Lkotlin/reflect/jvm/internal/impl/load/java/lazy/LazyJavaPackageFragmentProvider;Lkotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache;)V

    .line 85
    new-instance v7, Lkotlin/reflect/jvm/internal/impl/load/kotlin/JavaClassDataFinder;

    move-object/from16 v13, v34

    invoke-direct {v7, v1, v13}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/JavaClassDataFinder;-><init>(Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder;Lkotlin/reflect/jvm/internal/impl/load/kotlin/DeserializedDescriptorResolver;)V

    .line 86
    new-instance v8, Lkotlin/reflect/jvm/internal/impl/load/kotlin/BinaryClassAnnotationAndConstantLoaderImpl;

    move-object/from16 v4, v30

    move-object/from16 v10, v33

    invoke-direct {v8, v0, v10, v4, v1}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/BinaryClassAnnotationAndConstantLoaderImpl;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/NotFoundClasses;Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder;)V

    .line 89
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/load/kotlin/DeserializationComponentsForJava;

    .line 90
    sget-object v3, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/DeserializationConfiguration$Default;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/DeserializationConfiguration$Default;

    move-object v6, v3

    check-cast v6, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/DeserializationConfiguration;

    .line 92
    sget-object v3, Lkotlin/reflect/jvm/internal/components/RuntimeErrorReporter;->INSTANCE:Lkotlin/reflect/jvm/internal/components/RuntimeErrorReporter;

    move-object v11, v3

    check-cast v11, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/incremental/components/LookupTracker$DO_NOTHING;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/incremental/components/LookupTracker$DO_NOTHING;

    move-object v12, v3

    check-cast v12, Lkotlin/reflect/jvm/internal/impl/incremental/components/LookupTracker;

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ContractDeserializer;->Companion:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ContractDeserializer$Companion;

    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ContractDeserializer$Companion;->getDEFAULT()Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ContractDeserializer;

    move-result-object v16

    move-object v3, v1

    move-object v5, v0

    move-object v0, v13

    move-object/from16 v13, v16

    .line 89
    invoke-direct/range {v3 .. v13}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/DeserializationComponentsForJava;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/DeserializationConfiguration;Lkotlin/reflect/jvm/internal/impl/load/kotlin/JavaClassDataFinder;Lkotlin/reflect/jvm/internal/impl/load/kotlin/BinaryClassAnnotationAndConstantLoaderImpl;Lkotlin/reflect/jvm/internal/impl/load/java/lazy/LazyJavaPackageFragmentProvider;Lkotlin/reflect/jvm/internal/impl/descriptors/NotFoundClasses;Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter;Lkotlin/reflect/jvm/internal/impl/incremental/components/LookupTracker;Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ContractDeserializer;)V

    move-object/from16 v3, v35

    .line 95
    invoke-virtual {v3, v15}, Lkotlin/reflect/jvm/internal/impl/load/java/lazy/SingleModuleClassResolver;->setResolver(Lkotlin/reflect/jvm/internal/impl/resolve/jvm/JavaDescriptorResolver;)V

    .line 96
    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/DeserializedDescriptorResolver;->setComponents(Lkotlin/reflect/jvm/internal/impl/load/kotlin/DeserializationComponentsForJava;)V

    const/4 v0, 0x2

    .line 98
    new-array v0, v0, [Lkotlin/reflect/jvm/internal/impl/descriptors/impl/ModuleDescriptorImpl;

    move-object/from16 v3, v36

    aput-object v3, v0, v24

    invoke-virtual {v14}, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/JvmBuiltIns;->getBuiltInsModule()Lkotlin/reflect/jvm/internal/impl/descriptors/impl/ModuleDescriptorImpl;

    move-result-object v4

    const-string v5, "builtIns.builtInsModule"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v4, v0, v2

    invoke-virtual {v3, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/impl/ModuleDescriptorImpl;->setDependencies([Lkotlin/reflect/jvm/internal/impl/descriptors/impl/ModuleDescriptorImpl;)V

    .line 99
    invoke-virtual {v15}, Lkotlin/reflect/jvm/internal/impl/resolve/jvm/JavaDescriptorResolver;->getPackageFragmentProvider()Lkotlin/reflect/jvm/internal/impl/load/java/lazy/LazyJavaPackageFragmentProvider;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/descriptors/PackageFragmentProvider;

    invoke-virtual {v3, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/impl/ModuleDescriptorImpl;->initialize(Lkotlin/reflect/jvm/internal/impl/descriptors/PackageFragmentProvider;)V

    .line 101
    new-instance v0, Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/load/kotlin/DeserializationComponentsForJava;->getComponents()Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/DeserializationComponents;

    move-result-object v1

    move-object/from16 v2, v32

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;-><init>(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/DeserializationComponents;Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
