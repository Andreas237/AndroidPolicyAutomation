.class public final Lio/sentry/jvmti/Frame;
.super Ljava/lang/Object;
.source "Frame.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/jvmti/Frame$LocalVariable;
    }
.end annotation


# instance fields
.field private final locals:[Lio/sentry/jvmti/Frame$LocalVariable;

.field private method:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;[Lio/sentry/jvmti/Frame$LocalVariable;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lio/sentry/jvmti/Frame;->method:Ljava/lang/reflect/Method;

    .line 30
    iput-object p2, p0, Lio/sentry/jvmti/Frame;->locals:[Lio/sentry/jvmti/Frame$LocalVariable;

    return-void
.end method


# virtual methods
.method public getLocals()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lio/sentry/jvmti/Frame;->locals:[Lio/sentry/jvmti/Frame$LocalVariable;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/sentry/jvmti/Frame;->locals:[Lio/sentry/jvmti/Frame$LocalVariable;

    array-length v0, v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 47
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 48
    iget-object v1, p0, Lio/sentry/jvmti/Frame;->locals:[Lio/sentry/jvmti/Frame$LocalVariable;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    if-eqz v4, :cond_1

    .line 50
    invoke-virtual {v4}, Lio/sentry/jvmti/Frame$LocalVariable;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lio/sentry/jvmti/Frame$LocalVariable;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v0

    .line 44
    :cond_3
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getMethod()Ljava/lang/reflect/Method;
    .locals 1

    .line 34
    iget-object v0, p0, Lio/sentry/jvmti/Frame;->method:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Frame{, locals="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/jvmti/Frame;->locals:[Lio/sentry/jvmti/Frame$LocalVariable;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
