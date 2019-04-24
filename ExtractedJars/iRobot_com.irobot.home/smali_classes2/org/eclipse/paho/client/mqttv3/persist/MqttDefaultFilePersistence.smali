.class public Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;


# static fields
.field private static final FILE_FILTER:Ljava/io/FilenameFilter;

.field private static final LOCK_FILENAME:Ljava/lang/String; = ".lck"

.field private static final MESSAGE_BACKUP_FILE_EXTENSION:Ljava/lang/String; = ".bup"

.field private static final MESSAGE_FILE_EXTENSION:Ljava/lang/String; = ".msg"


# instance fields
.field private clientDir:Ljava/io/File;

.field private dataDir:Ljava/io/File;

.field private fileLock:Lorg/eclipse/paho/client/mqttv3/internal/FileLock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence$1;

    invoke-direct {v0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence$1;-><init>()V

    sput-object v0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->FILE_FILTER:Ljava/io/FilenameFilter;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "user.dir"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->fileLock:Lorg/eclipse/paho/client/mqttv3/internal/FileLock;

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->dataDir:Ljava/io/File;

    return-void
.end method

.method private checkIsOpen()V
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    if-nez v0, :cond_0

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;

    invoke-direct {v0}, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;-><init>()V

    throw v0

    :cond_0
    return-void
.end method

.method private getFiles()[Ljava/io/File;
    .locals 2

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->checkIsOpen()V

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->FILE_FILTER:Ljava/io/FilenameFilter;

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;

    invoke-direct {v0}, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;-><init>()V

    throw v0

    :cond_0
    return-object v0
.end method

.method private isSafeChar(C)Z
    .locals 1

    invoke-static {p1}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x2d

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private restoreBackups(Ljava/io/File;)V
    .locals 7

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence$2;

    invoke-direct {v0, p0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence$2;-><init>(Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;)V

    invoke-virtual {p1, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;

    invoke-direct {p1}, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;-><init>()V

    throw p1

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-lt v2, v3, :cond_1

    return-void

    :cond_1
    new-instance v3, Ljava/io/File;

    aget-object v4, v0, v2

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    aget-object v5, v0, v2

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    const-string v6, ".bup"

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aget-object v4, v0, v2

    invoke-virtual {v4, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    aget-object v4, v0, v2

    invoke-virtual {v4, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method


# virtual methods
.method public clear()V
    .locals 3

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->checkIsOpen()V

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->getFiles()[Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-lt v1, v2, :cond_0

    return-void

    :cond_0
    aget-object v2, v0, v1

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public close()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->fileLock:Lorg/eclipse/paho/client/mqttv3/internal/FileLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->fileLock:Lorg/eclipse/paho/client/mqttv3/internal/FileLock;

    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/FileLock;->release()V

    :cond_0
    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->getFiles()[Ljava/io/File;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public containsKey(Ljava/lang/String;)Z
    .locals 3

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->checkIsOpen()V

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string p1, ".msg"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    return p1
.end method

.method public get(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttPersistable;
    .locals 10

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->checkIsOpen()V

    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v3, ".msg"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v1}, Ljava/io/FileInputStream;->available()I

    move-result v0

    new-array v4, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-lt v2, v0, :cond_0

    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;

    const/4 v5, 0x0

    array-length v6, v4

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    move-object v3, p1

    invoke-direct/range {v2 .. v9}, Lorg/eclipse/paho/client/mqttv3/internal/MqttPersistentData;-><init>(Ljava/lang/String;[BII[BII)V

    return-object v0

    :cond_0
    sub-int v3, v0, v2

    invoke-virtual {v1, v4, v2, v3}, Ljava/io/FileInputStream;->read([BII)I

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v2, v3

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;

    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public keys()Ljava/util/Enumeration;
    .locals 7

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->checkIsOpen()V

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->getFiles()[Ljava/io/File;

    move-result-object v0

    new-instance v1, Ljava/util/Vector;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/Vector;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    array-length v4, v0

    if-lt v3, v4, :cond_0

    invoke-virtual {v1}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0

    :cond_0
    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    const-string v6, ".msg"

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method public open(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->dataDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->dataDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;

    invoke-direct {p1}, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;-><init>()V

    throw p1

    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->dataDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->dataDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;

    invoke-direct {p1}, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;-><init>()V

    throw p1

    :cond_1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->dataDir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;

    invoke-direct {p1}, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;-><init>()V

    throw p1

    :cond_2
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v2, v3, :cond_6

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lt v1, p1, :cond_4

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    if-nez p1, :cond_3

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/io/File;

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->dataDir:Ljava/io/File;

    invoke-direct {p2, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->mkdir()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :try_start_1
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/internal/FileLock;

    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    const-string v0, ".lck"

    invoke-direct {p1, p2, v0}, Lorg/eclipse/paho/client/mqttv3/internal/FileLock;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->fileLock:Lorg/eclipse/paho/client/mqttv3/internal/FileLock;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :try_start_2
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->restoreBackups(Ljava/io/File;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_4
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->isSafeChar(C)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-direct {p0, v3}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->isSafeChar(C)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V
    .locals 5

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->checkIsOpen()V

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v3, ".msg"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string p1, ".msg"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, ".bup"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    :cond_0
    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-interface {p2}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getHeaderBytes()[B

    move-result-object v2

    invoke-interface {p2}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getHeaderOffset()I

    move-result v3

    invoke-interface {p2}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getHeaderLength()I

    move-result v4

    invoke-virtual {p1, v2, v3, v4}, Ljava/io/FileOutputStream;->write([BII)V

    invoke-interface {p2}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getPayloadBytes()[B

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getPayloadBytes()[B

    move-result-object v2

    invoke-interface {p2}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getPayloadOffset()I

    move-result v3

    invoke-interface {p2}, Lorg/eclipse/paho/client/mqttv3/MqttPersistable;->getPayloadLength()I

    move-result p2

    invoke-virtual {p1, v2, v3, p2}, Ljava/io/FileOutputStream;->write([BII)V

    :cond_1
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/FileDescriptor;->sync()V

    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    new-instance p2, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;

    invoke-direct {p2, p1}, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    :cond_4
    throw p1
.end method

.method public remove(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->checkIsOpen()V

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;->clientDir:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string p1, ".msg"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    return-void
.end method
