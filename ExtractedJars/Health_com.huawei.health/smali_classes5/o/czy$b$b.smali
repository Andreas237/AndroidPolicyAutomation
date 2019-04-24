.class public Lo/czy$b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/czy$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/czy$b$b$d;,
        Lo/czy$b$b$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/czy$a;>;"
        }
    .end annotation
.end field

.field final synthetic b:Lo/czy$b;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/czy$a;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<Lo/czy$a;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/czy$a;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lo/czy$b;)V
    .locals 10

    .line 229
    iput-object p1, p0, Lo/czy$b$b;->b:Lo/czy$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 223
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/czy$b$b;->e:Ljava/util/List;

    .line 224
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/czy$b$b;->a:Ljava/util/List;

    .line 225
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/czy$b$b;->c:Ljava/util/List;

    .line 230
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 232
    invoke-static {p1}, Lo/czy$b;->d(Lo/czy$b;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/czy$b$b;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 233
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/czy$b$b$b;

    .line 234
    invoke-virtual {v5}, Lo/czy$b$b$b;->b()V

    .line 235
    invoke-static {v5}, Lo/czy$b$b$b;->b(Lo/czy$b$b$b;)Ljava/util/Set;

    move-result-object v6

    .line 237
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 239
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 240
    new-instance v9, Lo/czy$b$b$d;

    const/4 v0, 0x0

    invoke-direct {v9, p0, v0}, Lo/czy$b$b$d;-><init>(Lo/czy$b$b;F)V

    goto :goto_2

    .line 242
    :cond_0
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/czy$b$b$d;

    .line 245
    :goto_2
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v9, v0}, Lo/czy$b$b$d;->d(F)V

    .line 247
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    goto :goto_1

    .line 249
    :cond_1
    goto/16 :goto_0

    .line 251
    :cond_2
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    .line 252
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 253
    iget-object v0, p0, Lo/czy$b$b;->e:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    goto :goto_3

    .line 256
    :cond_3
    iget-object v0, p0, Lo/czy$b$b;->e:Ljava/util/List;

    new-instance v1, Lo/czy$b$b$2;

    invoke-direct {v1, p0, p1, v2}, Lo/czy$b$b$2;-><init>(Lo/czy$b$b;Lo/czy$b;Ljava/util/Map;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 268
    invoke-static {p1}, Lo/czy$b;->d(Lo/czy$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/czy$a;

    .line 269
    iget-object v0, p0, Lo/czy$b$b;->e:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 270
    goto :goto_4

    .line 272
    :cond_4
    iget-object v0, p0, Lo/czy$b$b;->a:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 273
    goto :goto_4

    .line 275
    :cond_5
    iget-object v0, p0, Lo/czy$b$b;->c:Ljava/util/List;

    iget-object v1, p0, Lo/czy$b$b;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 276
    iget-object v0, p0, Lo/czy$b$b;->c:Ljava/util/List;

    iget-object v1, p0, Lo/czy$b$b;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 278
    iget-object v0, p0, Lo/czy$b$b;->c:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 279
    iget-object v0, p0, Lo/czy$b$b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lo/czy$b$b;->d:Ljava/util/Iterator;

    .line 280
    return-void
.end method

.method private d(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/czy$a;>;)Ljava/util/List<Lo/czy$b$b$b;>;"
        }
    .end annotation

    .line 291
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 292
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 293
    const/4 v5, 0x0

    .line 295
    const/4 v6, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 297
    if-eq v4, v6, :cond_1

    iget-object v0, p0, Lo/czy$b$b;->b:Lo/czy$b;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/czy$a;

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/czy$a;

    invoke-static {v0, v1, v2}, Lo/czy$b;->b(Lo/czy$b;Lo/czy$a;Lo/czy$a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 298
    if-nez v5, :cond_0

    .line 299
    new-instance v5, Lo/czy$b$b$b;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Lo/czy$b$b$b;-><init>(Lo/czy$b$b;Lo/czy$4;)V

    .line 300
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/czy$a;

    invoke-virtual {v5, v0}, Lo/czy$b$b$b;->e(Lo/czy$a;)V

    .line 301
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 303
    :cond_0
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/czy$a;

    invoke-virtual {v5, v0}, Lo/czy$b$b$b;->e(Lo/czy$a;)V

    .line 295
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 292
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 307
    :cond_3
    return-object v3
.end method


# virtual methods
.method public a()Lo/czy$a;
    .locals 1

    .line 287
    iget-object v0, p0, Lo/czy$b$b;->d:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/czy$a;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 283
    iget-object v0, p0, Lo/czy$b$b;->d:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method
