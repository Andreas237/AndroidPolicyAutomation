.class public final Lo/fud;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static volatile a:I

.field private static final b:[Ljava/lang/String;

.field static final c:Lo/fup;

.field static final d:Lo/fuj;

.field static e:Z

.field private static k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 85
    const/4 v0, 0x0

    sput v0, Lo/fud;->a:I

    .line 86
    new-instance v0, Lo/fup;

    invoke-direct {v0}, Lo/fup;-><init>()V

    sput-object v0, Lo/fud;->c:Lo/fup;

    .line 87
    new-instance v0, Lo/fuj;

    invoke-direct {v0}, Lo/fuj;-><init>()V

    sput-object v0, Lo/fud;->d:Lo/fuj;

    .line 93
    const-string v0, "slf4j.detectLoggerNameMismatch"

    invoke-static {v0}, Lo/fuq;->b(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lo/fud;->e:Z

    .line 102
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "1.6"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "1.7"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/fud;->b:[Ljava/lang/String;

    .line 290
    const-string v0, "org/slf4j/impl/StaticLoggerBinder.class"

    sput-object v0, Lo/fud;->k:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    return-void
.end method

.method static a()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/net/URL;>;"
        }
    .end annotation

    .line 296
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 298
    :try_start_0
    const-class v0, Lo/fud;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    .line 300
    if-nez v2, :cond_0

    .line 301
    sget-object v0, Lo/fud;->k:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/ClassLoader;->getSystemResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v3

    goto :goto_0

    .line 303
    :cond_0
    sget-object v0, Lo/fud;->k:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v3

    .line 305
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 306
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/net/URL;

    .line 307
    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 308
    goto :goto_0

    .line 311
    :cond_1
    goto :goto_1

    .line 309
    :catch_0
    move-exception v2

    .line 310
    const-string v0, "Error getting resources from path"

    invoke-static {v0, v2}, Lo/fuq;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 312
    :goto_1
    return-object v1
.end method

.method private static a(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Ljava/net/URL;>;)V"
        }
    .end annotation

    .line 343
    if-eqz p0, :cond_0

    invoke-static {p0}, Lo/fud;->b(Ljava/util/Set;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 344
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Actual binding is of type ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lorg/slf4j/impl/StaticLoggerBinder;->getSingleton()Lorg/slf4j/impl/StaticLoggerBinder;

    move-result-object v1

    invoke-virtual {v1}, Lorg/slf4j/impl/StaticLoggerBinder;->getLoggerFactoryClassStr()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 346
    :cond_0
    return-void
.end method

.method private static b()V
    .locals 6

    .line 184
    sget-object v1, Lo/fud;->c:Lo/fup;

    monitor-enter v1

    .line 185
    :try_start_0
    sget-object v0, Lo/fud;->c:Lo/fup;

    invoke-virtual {v0}, Lo/fup;->c()V

    .line 186
    sget-object v0, Lo/fud;->c:Lo/fup;

    invoke-virtual {v0}, Lo/fup;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fur;

    .line 187
    invoke-virtual {v3}, Lo/fur;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v4

    .line 188
    invoke-virtual {v3, v4}, Lo/fur;->a(Lo/fty;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    goto :goto_0

    .line 190
    :cond_0
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v1

    throw v5

    .line 192
    :goto_1
    return-void
.end method

.method private static b(Lo/fuk;)V
    .locals 4

    .line 229
    if-nez p0, :cond_0

    .line 230
    return-void

    .line 232
    :cond_0
    invoke-virtual {p0}, Lo/fuk;->d()Lo/fur;

    move-result-object v2

    .line 233
    invoke-virtual {v2}, Lo/fur;->a()Ljava/lang/String;

    move-result-object v3

    .line 234
    invoke-virtual {v2}, Lo/fur;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 235
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Delegate logger cannot be null at this state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 238
    :cond_1
    invoke-virtual {v2}, Lo/fur;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 240
    :cond_2
    invoke-virtual {v2}, Lo/fur;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 241
    invoke-virtual {v2, p0}, Lo/fur;->c(Lo/fuf;)V

    goto :goto_0

    .line 243
    :cond_3
    invoke-static {v3}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 245
    :goto_0
    return-void
.end method

.method private static b(Lo/fuk;I)V
    .locals 1

    .line 219
    invoke-virtual {p0}, Lo/fuk;->d()Lo/fur;

    move-result-object v0

    invoke-virtual {v0}, Lo/fur;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    invoke-static {p1}, Lo/fud;->c(I)V

    goto :goto_0

    .line 221
    :cond_0
    invoke-virtual {p0}, Lo/fuk;->d()Lo/fur;

    move-result-object v0

    invoke-virtual {v0}, Lo/fur;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 224
    :cond_1
    invoke-static {}, Lo/fud;->h()V

    .line 226
    :goto_0
    return-void
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 1

    .line 131
    if-nez p0, :cond_0

    .line 132
    const/4 v0, 0x0

    return v0

    .line 133
    :cond_0
    const-string v0, "org/slf4j/impl/StaticLoggerBinder"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    const/4 v0, 0x1

    return v0

    .line 135
    :cond_1
    const-string v0, "org.slf4j.impl.StaticLoggerBinder"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 136
    const/4 v0, 0x1

    return v0

    .line 137
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private static b(Ljava/util/Set;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Ljava/net/URL;>;)Z"
        }
    .end annotation

    .line 316
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(Ljava/lang/String;)Lo/fty;
    .locals 2

    .line 357
    invoke-static {}, Lo/fud;->e()Lo/fuc;

    move-result-object v1

    .line 358
    invoke-interface {v1, p0}, Lo/fuc;->e(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    return-object v0
.end method

.method private static final c()V
    .locals 2

    .line 124
    invoke-static {}, Lo/fud;->d()V

    .line 125
    sget v0, Lo/fud;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 126
    invoke-static {}, Lo/fud;->i()V

    .line 128
    :cond_0
    return-void
.end method

.method private static c(I)V
    .locals 2

    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A number ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") of logging calls during the initialization phase have been intercepted and are"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 257
    const-string v0, "now being replayed. These are subject to the filtering rules of the underlying logging system."

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 258
    const-string v0, "See also http://www.slf4j.org/codes.html#replay"

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 259
    return-void
.end method

.method static c(Ljava/lang/Throwable;)V
    .locals 1

    .line 195
    const/4 v0, 0x2

    sput v0, Lo/fud;->a:I

    .line 196
    const-string v0, "Failed to instantiate SLF4J LoggerFactory"

    invoke-static {v0, p0}, Lo/fuq;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 197
    return-void
.end method

.method private static final d()V
    .locals 4

    .line 142
    const/4 v2, 0x0

    .line 145
    :try_start_0
    invoke-static {}, Lo/fud;->k()Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    invoke-static {}, Lo/fud;->a()Ljava/util/Set;

    move-result-object v2

    .line 147
    invoke-static {v2}, Lo/fud;->d(Ljava/util/Set;)V

    .line 150
    :cond_0
    invoke-static {}, Lorg/slf4j/impl/StaticLoggerBinder;->getSingleton()Lorg/slf4j/impl/StaticLoggerBinder;

    .line 151
    const/4 v0, 0x3

    sput v0, Lo/fud;->a:I

    .line 152
    invoke-static {v2}, Lo/fud;->a(Ljava/util/Set;)V

    .line 153
    invoke-static {}, Lo/fud;->b()V

    .line 154
    invoke-static {}, Lo/fud;->g()V

    .line 156
    sget-object v0, Lo/fud;->c:Lo/fup;

    invoke-virtual {v0}, Lo/fup;->e()V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 180
    goto :goto_1

    .line 157
    :catch_0
    move-exception v2

    .line 158
    invoke-virtual {v2}, Ljava/lang/NoClassDefFoundError;->getMessage()Ljava/lang/String;

    move-result-object v3

    .line 159
    invoke-static {v3}, Lo/fud;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    const/4 v0, 0x4

    sput v0, Lo/fud;->a:I

    .line 161
    const-string v0, "Failed to load class \"org.slf4j.impl.StaticLoggerBinder\"."

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 162
    const-string v0, "Defaulting to no-operation (NOP) logger implementation"

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 163
    const-string v0, "See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details."

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 165
    :cond_1
    invoke-static {v2}, Lo/fud;->c(Ljava/lang/Throwable;)V

    .line 166
    throw v2

    .line 180
    :goto_0
    goto :goto_1

    .line 168
    :catch_1
    move-exception v2

    .line 169
    invoke-virtual {v2}, Ljava/lang/NoSuchMethodError;->getMessage()Ljava/lang/String;

    move-result-object v3

    .line 170
    if-eqz v3, :cond_2

    const-string v0, "org.slf4j.impl.StaticLoggerBinder.getSingleton()"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 171
    const/4 v0, 0x2

    sput v0, Lo/fud;->a:I

    .line 172
    const-string v0, "slf4j-api 1.6.x (or later) is incompatible with this binding."

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 173
    const-string v0, "Your binding is version 1.5.5 or earlier."

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 174
    const-string v0, "Upgrade your binding to version 1.6.x."

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 176
    :cond_2
    throw v2

    .line 177
    :catch_2
    move-exception v2

    .line 178
    invoke-static {v2}, Lo/fud;->c(Ljava/lang/Throwable;)V

    .line 179
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected initialization failure"

    invoke-direct {v0, v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 181
    :goto_1
    return-void
.end method

.method private static d(Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Ljava/net/URL;>;)V"
        }
    .end annotation

    .line 325
    invoke-static {p0}, Lo/fud;->b(Ljava/util/Set;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 326
    const-string v0, "Class path contains multiple SLF4J bindings."

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 327
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/net/URL;

    .line 328
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Found binding in ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 329
    goto :goto_0

    .line 330
    :cond_0
    const-string v0, "See http://www.slf4j.org/codes.html#multiple_bindings for an explanation."

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 332
    :cond_1
    return-void
.end method

.method public static e()Lo/fuc;
    .locals 4

    .line 408
    sget v0, Lo/fud;->a:I

    if-nez v0, :cond_1

    .line 409
    const-class v2, Lo/fud;

    monitor-enter v2

    .line 410
    :try_start_0
    sget v0, Lo/fud;->a:I

    if-nez v0, :cond_0

    .line 411
    const/4 v0, 0x1

    sput v0, Lo/fud;->a:I

    .line 412
    invoke-static {}, Lo/fud;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 414
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 416
    :cond_1
    :goto_0
    sget v0, Lo/fud;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 418
    :pswitch_0
    invoke-static {}, Lorg/slf4j/impl/StaticLoggerBinder;->getSingleton()Lorg/slf4j/impl/StaticLoggerBinder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/slf4j/impl/StaticLoggerBinder;->getLoggerFactory()Lorg/slf4j/ILoggerFactory;

    move-result-object v0

    return-object v0

    .line 420
    :pswitch_1
    sget-object v0, Lo/fud;->d:Lo/fuj;

    return-object v0

    .line 422
    :pswitch_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 426
    :pswitch_3
    sget-object v0, Lo/fud;->c:Lo/fup;

    return-object v0

    .line 428
    :goto_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unreachable code"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static g()V
    .locals 9

    .line 200
    sget-object v0, Lo/fud;->c:Lo/fup;

    invoke-virtual {v0}, Lo/fup;->a()Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object v1

    .line 201
    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    move-result v2

    .line 202
    const/4 v3, 0x0

    .line 203
    const/16 v4, 0x80

    .line 204
    new-instance v5, Ljava/util/ArrayList;

    const/16 v0, 0x80

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 206
    :goto_0
    const/16 v0, 0x80

    invoke-virtual {v1, v5, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->drainTo(Ljava/util/Collection;I)I

    move-result v6

    .line 207
    if-nez v6, :cond_0

    .line 208
    goto :goto_2

    .line 209
    :cond_0
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/fuk;

    .line 210
    invoke-static {v8}, Lo/fud;->b(Lo/fuk;)V

    .line 211
    move v0, v3

    add-int/lit8 v3, v3, 0x1

    if-nez v0, :cond_1

    .line 212
    invoke-static {v8, v2}, Lo/fud;->b(Lo/fuk;I)V

    .line 213
    :cond_1
    goto :goto_1

    .line 214
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 215
    goto :goto_0

    .line 216
    :goto_2
    return-void
.end method

.method private static h()V
    .locals 1

    .line 248
    const-string v0, "The following set of substitute loggers may have been accessed"

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 249
    const-string v0, "during the initialization phase. Logging calls during this"

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 250
    const-string v0, "phase were not honored. However, subsequent logging calls to these"

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 251
    const-string v0, "loggers will work as normally expected."

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 252
    const-string v0, "See also http://www.slf4j.org/codes.html#substituteLogger"

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 253
    return-void
.end method

.method private static final i()V
    .locals 8

    .line 263
    :try_start_0
    sget-object v2, Lorg/slf4j/impl/StaticLoggerBinder;->REQUESTED_API_VERSION:Ljava/lang/String;

    .line 265
    const/4 v3, 0x0

    .line 266
    sget-object v4, Lo/fud;->b:[Ljava/lang/String;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 267
    invoke-virtual {v2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    const/4 v3, 0x1

    .line 266
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 271
    :cond_1
    if-nez v3, :cond_2

    .line 272
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The requested version "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " by your slf4j binding is not compatible with "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/fud;->b:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V

    .line 274
    const-string v0, "See http://www.slf4j.org/codes.html#version_mismatch for further details."

    invoke-static {v0}, Lo/fuq;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 284
    :cond_2
    goto :goto_1

    .line 276
    :catch_0
    move-exception v2

    .line 284
    goto :goto_1

    .line 281
    :catch_1
    move-exception v2

    .line 283
    const-string v0, "Unexpected problem occured during version sanity check"

    invoke-static {v0, v2}, Lo/fuq;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 285
    :goto_1
    return-void
.end method

.method private static k()Z
    .locals 3

    .line 335
    const-string v0, "java.vendor.url"

    invoke-static {v0}, Lo/fuq;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 336
    if-nez v2, :cond_0

    .line 337
    const/4 v0, 0x0

    return v0

    .line 338
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method
