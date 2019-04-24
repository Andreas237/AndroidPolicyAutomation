.class public final Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;
.super Ljava/lang/Object;
.source "MappedMethod.java"


# instance fields
.field private final conflictResolutionStrategy:Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;

.field private final method:Ljava/lang/reflect/Method;

.field private final serializedName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/String;Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;->method:Ljava/lang/reflect/Method;

    .line 30
    iput-object p2, p0, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;->serializedName:Ljava/lang/String;

    .line 31
    iput-object p3, p0, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;->conflictResolutionStrategy:Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;

    return-void
.end method


# virtual methods
.method public getConflictResolutionStrategy()Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;
    .locals 1

    .line 25
    iget-object v0, p0, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;->conflictResolutionStrategy:Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;

    return-object v0
.end method

.method public getMethod()Ljava/lang/reflect/Method;
    .locals 1

    .line 17
    iget-object v0, p0, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;->method:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public getSerializedName()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lio/gsonfire/postprocessors/methodinvoker/MappedMethod;->serializedName:Ljava/lang/String;

    return-object v0
.end method
