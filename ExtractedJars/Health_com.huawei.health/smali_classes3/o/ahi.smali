.class public Lo/ahi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ahi$d;,
        Lo/ahi$a;,
        Lo/ahi$e;
    }
.end annotation


# static fields
.field private static final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lo/ahi;>;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/concurrent/locks/ReentrantLock;

.field private static e:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/ahi$d;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/ahi;->b:Ljava/util/HashMap;

    .line 40
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lo/ahi;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 42
    const/4 v0, 0x0

    sput-object v0, Lo/ahi;->e:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ahi;->a:Ljava/util/ArrayList;

    .line 93
    return-void
.end method

.method public static varargs a(Lo/ahi$e;[Ljava/lang/String;)V
    .locals 10

    .line 174
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 175
    :cond_0
    return-void

    .line 178
    :cond_1
    sget-object v0, Lo/ahi;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 180
    move-object v1, p1

    :try_start_0
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_7

    aget-object v4, v1, v3

    .line 181
    if-nez v4, :cond_2

    .line 182
    goto/16 :goto_3

    .line 185
    :cond_2
    sget-object v0, Lo/ahi;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ahi;

    .line 186
    if-nez v5, :cond_3

    .line 187
    goto :goto_3

    .line 190
    :cond_3
    iget-object v6, v5, Lo/ahi;->a:Ljava/util/ArrayList;

    .line 191
    const/4 v7, 0x0

    .line 192
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 193
    :goto_1
    if-ge v7, v8, :cond_5

    .line 194
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ahi$d;

    iget-object v0, v0, Lo/ahi$d;->b:Lo/ahi$e;

    if-ne v0, p0, :cond_4

    .line 195
    goto :goto_2

    .line 193
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 198
    :cond_5
    :goto_2
    if-ge v7, v8, :cond_6

    .line 199
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 200
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 201
    sget-object v0, Lo/ahi;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    sget-object v0, Lo/ahi;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lo/ahi;->e:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_6

    .line 203
    sget-object v0, Lo/ahi;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 204
    const/4 v0, 0x0

    sput-object v0, Lo/ahi;->e:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    :cond_6
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 210
    :cond_7
    sget-object v0, Lo/ahi;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 211
    goto :goto_4

    .line 210
    :catchall_0
    move-exception v9

    sget-object v0, Lo/ahi;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 211
    throw v9

    .line 212
    :goto_4
    return-void
.end method

.method static synthetic b()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 18
    sget-object v0, Lo/ahi;->e:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic c(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 18
    sput-object p0, Lo/ahi;->e:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public static varargs d(Lo/ahi$e;I[Ljava/lang/String;)V
    .locals 12

    .line 131
    if-eqz p0, :cond_0

    if-eqz p2, :cond_0

    array-length v0, p2

    if-nez v0, :cond_1

    .line 132
    :cond_0
    return-void

    .line 135
    :cond_1
    sget-object v0, Lo/ahi;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 137
    const/4 v1, 0x0

    .line 138
    move-object v2, p2

    :try_start_0
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_8

    aget-object v5, v2, v4

    .line 139
    if-nez v5, :cond_2

    .line 140
    goto :goto_3

    .line 142
    :cond_2
    sget-object v0, Lo/ahi;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ahi;

    .line 143
    if-nez v6, :cond_3

    .line 144
    new-instance v6, Lo/ahi;

    invoke-direct {v6}, Lo/ahi;-><init>()V

    .line 145
    sget-object v0, Lo/ahi;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    :cond_3
    iget-object v7, v6, Lo/ahi;->a:Ljava/util/ArrayList;

    .line 148
    const/4 v8, 0x0

    .line 149
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/ahi$d;

    .line 150
    iget-object v0, v10, Lo/ahi$d;->b:Lo/ahi$e;

    if-ne v0, p0, :cond_4

    .line 151
    const/4 v8, 0x1

    .line 152
    goto :goto_2

    .line 154
    :cond_4
    goto :goto_1

    .line 155
    :cond_5
    :goto_2
    if-nez v8, :cond_7

    .line 156
    if-nez v1, :cond_6

    .line 157
    new-instance v1, Lo/ahi$d;

    invoke-direct {v1, p0, p1}, Lo/ahi$d;-><init>(Lo/ahi$e;I)V

    .line 159
    :cond_6
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    :cond_7
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 163
    :cond_8
    sget-object v0, Lo/ahi;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 164
    goto :goto_4

    .line 163
    :catchall_0
    move-exception v11

    sget-object v0, Lo/ahi;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 164
    throw v11

    .line 165
    :goto_4
    return-void
.end method

.method public static e(Lo/ahi$a;)V
    .locals 7

    .line 101
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 102
    return-void

    .line 104
    :cond_0
    invoke-static {p0}, Lo/ahi$a;->e(Lo/ahi$a;)Ljava/lang/String;

    move-result-object v1

    .line 105
    if-nez v1, :cond_1

    .line 106
    return-void

    .line 109
    :cond_1
    sget-object v0, Lo/ahi;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 111
    :try_start_0
    sget-object v0, Lo/ahi;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ahi;

    .line 112
    if-eqz v2, :cond_2

    .line 113
    iget-object v3, v2, Lo/ahi;->a:Ljava/util/ArrayList;

    .line 114
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ahi$d;

    .line 115
    invoke-virtual {v5, p0}, Lo/ahi$d;->a(Lo/ahi$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    goto :goto_0

    .line 119
    :cond_2
    sget-object v0, Lo/ahi;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 120
    goto :goto_1

    .line 119
    :catchall_0
    move-exception v6

    sget-object v0, Lo/ahi;->c:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 120
    throw v6

    .line 121
    :goto_1
    return-void
.end method
