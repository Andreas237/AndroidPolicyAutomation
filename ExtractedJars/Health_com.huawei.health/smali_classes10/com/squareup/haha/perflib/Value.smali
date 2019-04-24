.class public Lcom/squareup/haha/perflib/Value;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final instance:Lcom/squareup/haha/perflib/Instance;

.field private mValue:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/squareup/haha/perflib/Instance;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/squareup/haha/perflib/Value;->instance:Lcom/squareup/haha/perflib/Instance;

    .line 30
    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/squareup/haha/perflib/Value;->mValue:Ljava/lang/Object;

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 3

    .line 37
    iput-object p1, p0, Lcom/squareup/haha/perflib/Value;->mValue:Ljava/lang/Object;

    .line 39
    instance-of v0, p1, Lcom/squareup/haha/perflib/Instance;

    if-eqz v0, :cond_0

    .line 40
    move-object v0, p1

    check-cast v0, Lcom/squareup/haha/perflib/Instance;

    iget-object v1, p0, Lcom/squareup/haha/perflib/Value;->instance:Lcom/squareup/haha/perflib/Instance;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/squareup/haha/perflib/Instance;->addReference(Lcom/squareup/haha/perflib/Field;Lcom/squareup/haha/perflib/Instance;)V

    .line 42
    :cond_0
    return-void
.end method
