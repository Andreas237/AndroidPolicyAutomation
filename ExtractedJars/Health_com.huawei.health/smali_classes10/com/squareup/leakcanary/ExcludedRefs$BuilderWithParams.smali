.class public final Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/leakcanary/ExcludedRefs$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/leakcanary/ExcludedRefs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BuilderWithParams"
.end annotation


# instance fields
.field private final classNames:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;>;"
        }
    .end annotation
.end field

.field private final fieldNameByClassName:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;>;>;"
        }
    .end annotation
.end field

.field private lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

.field private final staticFieldNameByClassName:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;>;>;"
        }
    .end annotation
.end field

.field private final threadNames:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->fieldNameByClassName:Ljava/util/Map;

    .line 122
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->staticFieldNameByClassName:Ljava/util/Map;

    .line 124
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->threadNames:Ljava/util/Map;

    .line 125
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->classNames:Ljava/util/Map;

    .line 130
    return-void
.end method

.method static synthetic access$000(Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;)Ljava/util/Map;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->fieldNameByClassName:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$100(Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;)Ljava/util/Map;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->staticFieldNameByClassName:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$200(Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;)Ljava/util/Map;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->threadNames:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$300(Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;)Ljava/util/Map;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->classNames:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public alwaysExclude()Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;
    .locals 2

    .line 184
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;->alwaysExclude:Z

    .line 185
    return-object p0
.end method

.method public build()Lcom/squareup/leakcanary/ExcludedRefs;
    .locals 1

    .line 189
    new-instance v0, Lcom/squareup/leakcanary/ExcludedRefs;

    invoke-direct {v0, p0}, Lcom/squareup/leakcanary/ExcludedRefs;-><init>(Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;)V

    return-object v0
.end method

.method public clazz(Ljava/lang/String;)Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;
    .locals 3

    .line 167
    const-string v0, "className"

    invoke-static {p1, v0}, Lcom/squareup/leakcanary/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 168
    new-instance v0, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "any subclass of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    .line 169
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->classNames:Ljava/util/Map;

    iget-object v1, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    return-object p0
.end method

.method public instanceField(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;
    .locals 4

    .line 133
    const-string v0, "className"

    invoke-static {p1, v0}, Lcom/squareup/leakcanary/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 134
    const-string v0, "fieldName"

    invoke-static {p2, v0}, Lcom/squareup/leakcanary/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->fieldNameByClassName:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    .line 136
    if-nez v3, :cond_0

    .line 137
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 138
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->fieldNameByClassName:Ljava/util/Map;

    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    :cond_0
    new-instance v0, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "field "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    .line 141
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    invoke-interface {v3, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    return-object p0
.end method

.method public named(Ljava/lang/String;)Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    iput-object p1, v0, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;->name:Ljava/lang/String;

    .line 175
    return-object p0
.end method

.method public reason(Ljava/lang/String;)Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    iput-object p1, v0, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;->reason:Ljava/lang/String;

    .line 180
    return-object p0
.end method

.method public staticField(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;
    .locals 4

    .line 146
    const-string v0, "className"

    invoke-static {p1, v0}, Lcom/squareup/leakcanary/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 147
    const-string v0, "fieldName"

    invoke-static {p2, v0}, Lcom/squareup/leakcanary/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 148
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->staticFieldNameByClassName:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    .line 149
    if-nez v3, :cond_0

    .line 150
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 151
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->staticFieldNameByClassName:Ljava/util/Map;

    invoke-interface {v0, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    :cond_0
    new-instance v0, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "static field "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    .line 154
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    invoke-interface {v3, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    return-object p0
.end method

.method public thread(Ljava/lang/String;)Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;
    .locals 3

    .line 159
    const-string v0, "threadName"

    invoke-static {p1, v0}, Lcom/squareup/leakcanary/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 160
    new-instance v0, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "any threads named "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    .line 161
    iget-object v0, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->threadNames:Ljava/util/Map;

    iget-object v1, p0, Lcom/squareup/leakcanary/ExcludedRefs$BuilderWithParams;->lastParams:Lcom/squareup/leakcanary/ExcludedRefs$ParamsBuilder;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    return-object p0
.end method
