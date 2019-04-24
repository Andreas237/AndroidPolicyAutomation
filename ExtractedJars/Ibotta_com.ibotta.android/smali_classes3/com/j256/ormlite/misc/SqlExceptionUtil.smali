.class public Lcom/j256/ormlite/misc/SqlExceptionUtil;
.super Ljava/lang/Object;
.source "SqlExceptionUtil.java"


# direct methods
.method public static create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
    .locals 1

    .line 22
    new-instance v0, Ljava/sql/SQLException;

    invoke-direct {v0, p0}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    .line 23
    invoke-virtual {v0, p1}, Ljava/sql/SQLException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method
