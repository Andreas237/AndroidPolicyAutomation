.class public Lo/cmv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cmv$a;,
        Lo/cmv$c;
    }
.end annotation


# static fields
.field private static b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/util/HashSet<Lo/cmj;>;>;"
        }
    .end annotation
.end field

.field private static d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lo/cmv$c<*>;>;"
        }
    .end annotation
.end field

.field private static e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/cmo;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/cmv;->d:Ljava/util/HashMap;

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/cmv;->b:Ljava/util/HashMap;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/cmv;->e:Ljava/util/ArrayList;

    .line 176
    const-string v0, "hwstepcounter"

    new-instance v1, Lo/cmv$4;

    const-string v2, "hwstepcounter"

    invoke-direct {v1, v2}, Lo/cmv$4;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lo/cmv;->d(Ljava/lang/String;Lo/cmv$c;)V

    .line 190
    const-string v0, "healthdeviceoper"

    new-instance v1, Lo/cmv$1;

    const-string v2, "healthdeviceoper"

    invoke-direct {v1, v2}, Lo/cmv$1;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lo/cmv;->d(Ljava/lang/String;Lo/cmv$c;)V

    .line 202
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lo/cmj;)Ljava/lang/Object;
    .locals 5

    .line 127
    sget-object v0, Lo/cmv;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/cmv$c;

    .line 128
    sget-object v0, Lo/cmv;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/HashSet;

    .line 129
    if-nez v4, :cond_0

    .line 130
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 131
    sget-object v0, Lo/cmv;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    :cond_0
    invoke-virtual {v4, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 134
    invoke-virtual {v4, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 136
    :cond_1
    const-string v0, "HealthOpenSDK_OSSR"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getServiceByOpenSDK fetcher = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    if-eqz v3, :cond_2

    invoke-interface {v3, p0}, Lo/cmv$c;->c(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method static synthetic c()Ljava/util/HashMap;
    .locals 1

    .line 26
    sget-object v0, Lo/cmv;->b:Ljava/util/HashMap;

    return-object v0
.end method

.method private static d(Ljava/lang/String;Lo/cmv$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/String;Lo/cmv$c<TT;>;)V"
        }
    .end annotation

    .line 171
    sget-object v0, Lo/cmv;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    return-void
.end method

.method public static e(Lo/cmj;)V
    .locals 7

    .line 142
    sget-object v0, Lo/cmv;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    .line 144
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 146
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 147
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 148
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/HashSet;

    .line 149
    if-nez v5, :cond_0

    .line 150
    goto :goto_0

    .line 152
    :cond_0
    invoke-virtual {v5, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 153
    goto :goto_0

    .line 156
    :cond_1
    invoke-virtual {v5, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 157
    invoke-virtual {v5}, Ljava/util/HashSet;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    goto :goto_0

    .line 161
    :cond_2
    sget-object v0, Lo/cmv;->d:Ljava/util/HashMap;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cmv$c;

    .line 162
    if-nez v6, :cond_3

    .line 163
    const-string v0, "HealthOpenSDK_OSSR"

    const-string v1, "release by opensdk fetcher null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    goto :goto_0

    .line 166
    :cond_3
    invoke-interface {v6}, Lo/cmv$c;->c()V

    .line 167
    goto :goto_0

    .line 168
    :cond_4
    return-void
.end method
