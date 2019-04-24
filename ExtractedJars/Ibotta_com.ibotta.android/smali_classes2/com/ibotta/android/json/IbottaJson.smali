.class public interface abstract Lcom/ibotta/android/json/IbottaJson;
.super Ljava/lang/Object;
.source "IbottaJson.java"


# virtual methods
.method public abstract fromJson(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Ljava/io/InputStream;",
            "TC;)TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Ljava/lang/String;",
            "TC;)TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract fromJsonToArrayList(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Ljava/io/InputStream;",
            "TC;)",
            "Ljava/util/ArrayList<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract fromJsonToArrayList(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Ljava/lang/String;",
            "TC;)",
            "Ljava/util/ArrayList<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract fromJsonToHashMap(Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/io/InputStream;",
            "TC1;TC2;)",
            "Ljava/util/HashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract fromJsonToHashMap(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/lang/String;",
            "TC1;TC2;)",
            "Ljava/util/HashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract fromJsonToHashSet(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Class<",
            "TR;>;>(",
            "Ljava/lang/String;",
            "TC;)",
            "Ljava/util/HashSet<",
            "TR;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract fromJsonToLinkedHashMap(Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/io/InputStream;",
            "TC1;TC2;)",
            "Ljava/util/LinkedHashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract fromJsonToLinkedHashMap(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/lang/String;",
            "TC1;TC2;)",
            "Ljava/util/LinkedHashMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract fromJsonToTreeMap(Ljava/io/InputStream;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/io/InputStream;",
            "TC1;TC2;)",
            "Ljava/util/TreeMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract fromJsonToTreeMap(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R1:",
            "Ljava/lang/Object;",
            "R2:",
            "Ljava/lang/Object;",
            "C1:",
            "Ljava/lang/Class<",
            "TR1;>;C2:",
            "Ljava/lang/Class<",
            "TR2;>;>(",
            "Ljava/lang/String;",
            "TC1;TC2;)",
            "Ljava/util/TreeMap<",
            "TR1;TR2;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract toJson(Ljava/lang/Object;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method public abstract toOutputStream(Ljava/io/OutputStream;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method
