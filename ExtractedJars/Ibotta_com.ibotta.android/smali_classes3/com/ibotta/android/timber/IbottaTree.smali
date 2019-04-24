.class public Lcom/ibotta/android/timber/IbottaTree;
.super Ltimber/log/Timber$DebugTree;
.source "IbottaTree.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ltimber/log/Timber$DebugTree;-><init>()V

    return-void
.end method

.method private logException(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Timber"

    const-string v1, "Timber error"

    .line 174
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method


# virtual methods
.method protected createStackElementTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;
    .locals 6

    .line 18
    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 20
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_5

    aget-object v3, v0, v2

    if-nez v3, :cond_0

    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    const-class v5, Lcom/ibotta/android/timber/IbottaTree;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    const-class v5, Lcom/ibotta/android/api/TimberLoggingImpl;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    .line 30
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    const-class v5, Lcom/ibotta/android/logging/IbottaLogger;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    .line 33
    :cond_3
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "com.ibotta"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 34
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_6

    .line 41
    invoke-super {p0, p1}, Ltimber/log/Timber$DebugTree;->createStackElementTag(Ljava/lang/StackTraceElement;)Ljava/lang/String;

    move-result-object v0

    :cond_6
    return-object v0
.end method

.method public varargs d(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 68
    :try_start_0
    invoke-super {p0, p1, p2}, Ltimber/log/Timber$DebugTree;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 70
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 77
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ltimber/log/Timber$DebugTree;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 79
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs e(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 122
    :try_start_0
    invoke-super {p0, p1, p2}, Ltimber/log/Timber$DebugTree;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 124
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 131
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ltimber/log/Timber$DebugTree;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 133
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs i(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 86
    :try_start_0
    invoke-super {p0, p1, p2}, Ltimber/log/Timber$DebugTree;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 88
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs i(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 95
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ltimber/log/Timber$DebugTree;->i(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 97
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs log(ILjava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 158
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ltimber/log/Timber$DebugTree;->log(ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 160
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs log(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 167
    :try_start_0
    invoke-super {p0, p1, p2, p3, p4}, Ltimber/log/Timber$DebugTree;->log(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 169
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs v(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 50
    :try_start_0
    invoke-super {p0, p1, p2}, Ltimber/log/Timber$DebugTree;->v(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 52
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs v(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 59
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ltimber/log/Timber$DebugTree;->v(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 61
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs w(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 104
    :try_start_0
    invoke-super {p0, p1, p2}, Ltimber/log/Timber$DebugTree;->w(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 106
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs w(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 113
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ltimber/log/Timber$DebugTree;->w(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 115
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs wtf(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 140
    :try_start_0
    invoke-super {p0, p1, p2}, Ltimber/log/Timber$DebugTree;->wtf(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 142
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public varargs wtf(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 149
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ltimber/log/Timber$DebugTree;->wtf(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 151
    invoke-direct {p0, p1}, Lcom/ibotta/android/timber/IbottaTree;->logException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
