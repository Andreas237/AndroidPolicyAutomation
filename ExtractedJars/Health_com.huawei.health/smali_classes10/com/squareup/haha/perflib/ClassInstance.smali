.class public Lcom/squareup/haha/perflib/ClassInstance;
.super Lcom/squareup/haha/perflib/Instance;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/perflib/ClassInstance$FieldValue;
    }
.end annotation


# instance fields
.field private final mValuesOffset:J


# direct methods
.method public constructor <init>(JLcom/squareup/haha/perflib/StackTrace;J)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Lcom/squareup/haha/perflib/Instance;-><init>(JLcom/squareup/haha/perflib/StackTrace;)V

    .line 32
    iput-wide p4, p0, Lcom/squareup/haha/perflib/ClassInstance;->mValuesOffset:J

    .line 33
    return-void
.end method


# virtual methods
.method public final accept(Lcom/squareup/haha/perflib/Visitor;)V
    .locals 4

    .line 64
    invoke-interface {p1, p0}, Lcom/squareup/haha/perflib/Visitor;->visitClassInstance(Lcom/squareup/haha/perflib/ClassInstance;)V

    .line 65
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/ClassInstance;->getValues()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;

    .line 66
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/squareup/haha/perflib/Instance;

    if-eqz v0, :cond_1

    .line 67
    iget-boolean v0, p0, Lcom/squareup/haha/perflib/ClassInstance;->mReferencesAdded:Z

    if-nez v0, :cond_0

    .line 68
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Instance;

    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getField()Lcom/squareup/haha/perflib/Field;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lcom/squareup/haha/perflib/Instance;->addReference(Lcom/squareup/haha/perflib/Field;Lcom/squareup/haha/perflib/Instance;)V

    .line 70
    :cond_0
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Instance;

    invoke-interface {p1, p0, v0}, Lcom/squareup/haha/perflib/Visitor;->visitLater(Lcom/squareup/haha/perflib/Instance;Lcom/squareup/haha/perflib/Instance;)V

    .line 72
    :cond_1
    goto :goto_0

    .line 73
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/haha/perflib/ClassInstance;->mReferencesAdded:Z

    .line 74
    return-void
.end method

.method getFields(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/squareup/haha/perflib/ClassInstance$FieldValue;>;"
        }
    .end annotation

    .line 38
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/ClassInstance;->getValues()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;

    .line 40
    invoke-virtual {v3}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;->getField()Lcom/squareup/haha/perflib/Field;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    :cond_0
    goto :goto_0

    .line 44
    :cond_1
    return-object v1
.end method

.method public getIsSoftReference()Z
    .locals 1

    .line 78
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/ClassInstance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/haha/perflib/ClassObj;->getIsSoftReference()Z

    move-result v0

    return v0
.end method

.method public getValues()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/squareup/haha/perflib/ClassInstance$FieldValue;>;"
        }
    .end annotation

    .line 49
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 51
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/ClassInstance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v4

    .line 52
    invoke-virtual {p0}, Lcom/squareup/haha/perflib/ClassInstance;->getBuffer()Lcom/squareup/haha/perflib/io/HprofBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/squareup/haha/perflib/ClassInstance;->mValuesOffset:J

    invoke-interface {v0, v1, v2}, Lcom/squareup/haha/perflib/io/HprofBuffer;->setPosition(J)V

    .line 53
    :goto_0
    if-eqz v4, :cond_1

    .line 54
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/ClassObj;->getFields()[Lcom/squareup/haha/perflib/Field;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_0

    aget-object v8, v5, v7

    .line 55
    new-instance v0, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;

    invoke-virtual {v8}, Lcom/squareup/haha/perflib/Field;->getType()Lcom/squareup/haha/perflib/Type;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/squareup/haha/perflib/ClassInstance;->readValue(Lcom/squareup/haha/perflib/Type;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v8, v1}, Lcom/squareup/haha/perflib/ClassInstance$FieldValue;-><init>(Lcom/squareup/haha/perflib/Field;Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 57
    :cond_0
    invoke-virtual {v4}, Lcom/squareup/haha/perflib/ClassObj;->getSuperClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v4

    goto :goto_0

    .line 59
    :cond_1
    return-object v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 82
    const-string v0, "%s@%d (0x%x)"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/squareup/haha/perflib/ClassInstance;->getClassObj()Lcom/squareup/haha/perflib/ClassObj;

    move-result-object v2

    invoke-virtual {v2}, Lcom/squareup/haha/perflib/ClassObj;->getClassName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/squareup/haha/perflib/ClassInstance;->getUniqueId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/squareup/haha/perflib/ClassInstance;->getUniqueId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
