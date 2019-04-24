.class public abstract Lcom/j256/ormlite/support/BaseConnectionSource;
.super Ljava/lang/Object;
.source "BaseConnectionSource.java"

# interfaces
.implements Lcom/j256/ormlite/support/ConnectionSource;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
    }
.end annotation


# instance fields
.field private specialConnection:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;

    return-void
.end method


# virtual methods
.method protected clearSpecial(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/logger/Logger;)Z
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const-string p1, "no connection has been saved when clear() called"

    .line 85
    invoke-virtual {p2, p1}, Lcom/j256/ormlite/logger/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 86
    :cond_1
    iget-object v1, v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    if-ne v1, p1, :cond_3

    .line 87
    invoke-virtual {v0}, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_2

    .line 89
    iget-object p1, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const-string v1, "connection saved {} is not the one being cleared {}"

    .line 93
    iget-object v0, v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    invoke-virtual {p2, v1, v0, p1}, Lcom/j256/ormlite/logger/Logger;->error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method protected getSavedConnection()Lcom/j256/ormlite/support/DatabaseConnection;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 33
    :cond_0
    iget-object v0, v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    return-object v0
.end method

.method public getSpecialConnection()Lcom/j256/ormlite/support/DatabaseConnection;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 21
    :cond_0
    iget-object v0, v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    return-object v0
.end method

.method protected saveSpecial(Lcom/j256/ormlite/support/DatabaseConnection;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;

    if-nez v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;

    new-instance v1, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;

    invoke-direct {v1, p1}, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;-><init>(Lcom/j256/ormlite/support/DatabaseConnection;)V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    .line 64
    :cond_0
    iget-object v1, v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    if-ne v1, p1, :cond_1

    .line 69
    invoke-virtual {v0}, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->increment()V

    const/4 p1, 0x0

    return p1

    .line 65
    :cond_1
    new-instance v1, Ljava/sql/SQLException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "trying to save connection "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " but already have saved connection "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
