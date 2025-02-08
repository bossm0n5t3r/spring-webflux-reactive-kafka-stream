# spring-webflux-reactive-kafka-stream

## How to run

### Run docker compose

```text
❯ docker compose start
[+] Running 2/2
 ✔ Container spring-webflux-reactive-kafka-stream-clickhouse  Started
 ✔ Container spring-webflux-reactive-kafka-stream-kafka       Started

```

### Run Application

```text
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.4.2)

2025-02-09T06:44:35.504+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] gWebfluxReactiveKafkaStreamApplicationKt : Starting SpringWebfluxReactiveKafkaStreamApplicationKt using Java 23.0.2 with PID 24762
2025-02-09T06:44:35.505+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] gWebfluxReactiveKafkaStreamApplicationKt : No active profile set, falling back to 1 default profile: "default"
2025-02-09T06:44:35.987+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'errorChannel' has been explicitly defined. Therefore, a default PublishSubscribeChannel will be created.
2025-02-09T06:44:35.992+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'integrationHeaderChannelRegistry' has been explicitly defined. Therefore, a default DefaultHeaderChannelRegistry will be created.
2025-02-09T06:44:36.104+09:00  WARN 24762 --- [spring-webflux-reactive-kafka-stream] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration$IntegrationJmxConfiguration' of type [org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration$IntegrationJmxConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). The currently created BeanPostProcessor [integrationMbeanExporter] is declared through a non-static factory method on that class; consider declaring it as static instead.
2025-02-09T06:44:36.110+09:00  WARN 24762 --- [spring-webflux-reactive-kafka-stream] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.stream.binder.kafka.config.ExtendedBindingHandlerMappingsProviderConfiguration' of type [org.springframework.cloud.stream.binder.kafka.config.ExtendedBindingHandlerMappingsProviderConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [integrationMbeanExporter]? Check the corresponding BeanPostProcessor declaration and its dependencies/advisors. If this bean does not have to be post-processed, declare it with ROLE_INFRASTRUCTURE.
2025-02-09T06:44:36.111+09:00  WARN 24762 --- [spring-webflux-reactive-kafka-stream] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'kafkaExtendedPropertiesDefaultMappingsProvider' of type [org.springframework.cloud.stream.binder.kafka.config.ExtendedBindingHandlerMappingsProviderConfiguration$$Lambda/0x00001c00014aa738] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [integrationMbeanExporter]? Check the corresponding BeanPostProcessor declaration and its dependencies/advisors. If this bean does not have to be post-processed, declare it with ROLE_INFRASTRUCTURE.
2025-02-09T06:44:36.111+09:00  WARN 24762 --- [spring-webflux-reactive-kafka-stream] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'BindingHandlerAdvise' of type [org.springframework.cloud.stream.config.BindingHandlerAdvise] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [integrationMbeanExporter]? Check the corresponding BeanPostProcessor declaration and its dependencies/advisors. If this bean does not have to be post-processed, declare it with ROLE_INFRASTRUCTURE.
2025-02-09T06:44:36.117+09:00  WARN 24762 --- [spring-webflux-reactive-kafka-stream] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'spelConverter' of type [org.springframework.cloud.stream.config.SpelExpressionConverterConfiguration$SpelConverter] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [integrationMbeanExporter]? Check the corresponding BeanPostProcessor declaration and its dependencies/advisors. If this bean does not have to be post-processed, declare it with ROLE_INFRASTRUCTURE.
2025-02-09T06:44:36.120+09:00  WARN 24762 --- [spring-webflux-reactive-kafka-stream] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'spring.jmx-org.springframework.boot.autoconfigure.jmx.JmxProperties' of type [org.springframework.boot.autoconfigure.jmx.JmxProperties] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [integrationMbeanExporter]? Check the corresponding BeanPostProcessor declaration and its dependencies/advisors. If this bean does not have to be post-processed, declare it with ROLE_INFRASTRUCTURE.
2025-02-09T06:44:36.124+09:00  WARN 24762 --- [spring-webflux-reactive-kafka-stream] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration' of type [org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [integrationMbeanExporter]? Check the corresponding BeanPostProcessor declaration and its dependencies/advisors. If this bean does not have to be post-processed, declare it with ROLE_INFRASTRUCTURE.
2025-02-09T06:44:36.125+09:00  WARN 24762 --- [spring-webflux-reactive-kafka-stream] [           main] trationDelegate$BeanPostProcessorChecker : Bean 'mbeanServer' of type [com.sun.jmx.mbeanserver.JmxMBeanServer] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying). Is this bean getting eagerly injected/applied to a currently created BeanPostProcessor [integrationMbeanExporter]? Check the corresponding BeanPostProcessor declaration and its dependencies/advisors. If this bean does not have to be post-processed, declare it with ROLE_INFRASTRUCTURE.
2025-02-09T06:44:36.359+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [       Thread-2] m.b.r.k.s.r.ClickHouseRepository         : Executing statement: CREATE TABLE IF NOT EXISTS stock_prices (
    symbol String,
    original_price Float64,
    currency String,
    timestamp DateTime64(9, 'UTC')
) ENGINE = MergeTree() ORDER BY (symbol, timestamp)
2025-02-09T06:44:36.827+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ckHouseWorker-1] m.b.r.k.s.r.ClickHouseRepository         : Executing statement: CREATE TABLE IF NOT EXISTS avg_stock_prices (
    date_time DateTime64(9, 'UTC'),
    symbol String,
    currency String,
    avg_price AggregateFunction(avg, Float64)
) ENGINE = AggregatingMergeTree()
ORDER BY (symbol, currency, date_time)
2025-02-09T06:44:36.837+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ckHouseWorker-2] m.b.r.k.s.r.ClickHouseRepository         : Executing statement: DROP TABLE IF EXISTS avg_stock_prices_mv
2025-02-09T06:44:36.843+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ckHouseWorker-3] m.b.r.k.s.r.ClickHouseRepository         : Executing statement: CREATE MATERIALIZED VIEW avg_stock_prices_mv TO avg_stock_prices AS
SELECT
    toStartOfMinute(timestamp) AS date_time,
    symbol,
    currency,
    avgState(original_price) AS avg_price
FROM stock_prices
GROUP BY symbol, currency, date_time
2025-02-09T06:44:36.914+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [oundedElastic-1] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values: 
	allow.auto.create.topics = true
	auto.commit.interval.ms = 5000
	auto.include.jmx.reporter = true
	auto.offset.reset = latest
	bootstrap.servers = [localhost:9092]
	check.crcs = true
	client.dns.lookup = use_all_dns_ips
	client.id = consumer-my-group-1
	client.rack = 
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = false
	enable.metrics.push = true
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = my-group
	group.instance.id = null
	group.protocol = classic
	group.remote.assignor = null
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	internal.throw.on.fetch.stable.offset.unsupported = false
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metadata.recovery.strategy = none
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor, class org.apache.kafka.clients.consumer.CooperativeStickyAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.max.ms = 1000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	session.timeout.ms = 45000
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.springframework.kafka.support.serializer.JsonDeserializer

2025-02-09T06:44:36.938+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [oundedElastic-1] o.a.k.c.t.i.KafkaMetricsCollector        : initializing Kafka metrics collector
2025-02-09T06:44:36.988+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [oundedElastic-1] o.a.k.clients.consumer.ConsumerConfig    : These configurations '[reactiveAutoCommit]' were supplied but are not used yet.
2025-02-09T06:44:36.991+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [oundedElastic-1] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.8.1
2025-02-09T06:44:36.991+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [oundedElastic-1] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 70d6ff42debf7e17
2025-02-09T06:44:36.991+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [oundedElastic-1] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1739051076990
2025-02-09T06:44:36.997+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] o.a.k.c.c.internals.LegacyKafkaConsumer  : [Consumer clientId=consumer-my-group-1, groupId=my-group] Assigned to partition(s): stock-prices-out-0, stock-prices-out-1
2025-02-09T06:44:36.999+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] m.b.r.k.s.k.consumer.StockPriceConsumer  : ************** onPartitionsAssigned: [stock-prices-out-0, stock-prices-out-1]
2025-02-09T06:44:37.171+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-my-group-1, groupId=my-group] Cluster ID: 5L6g3nShT-eMCtK--X86sw
2025-02-09T06:44:37.172+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-my-group-1, groupId=my-group] Discovered group coordinator localhost:9092 (id: 2147483646 rack: null)
2025-02-09T06:44:37.192+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] o.a.k.c.c.internals.ConsumerUtils        : Setting offset for partition stock-prices-out-0 to the committed offset FetchPosition{offset=3, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:9092 (id: 1 rack: null)], epoch=12}}
2025-02-09T06:44:37.192+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] o.a.k.c.c.internals.ConsumerUtils        : Setting offset for partition stock-prices-out-1 to the committed offset FetchPosition{offset=17, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:9092 (id: 1 rack: null)], epoch=12}}
2025-02-09T06:44:37.232+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.c.s.binder.DefaultBinderFactory      : Creating binder: kafka
2025-02-09T06:44:37.232+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.c.s.binder.DefaultBinderFactory      : Constructing binder child context for kafka
2025-02-09T06:44:37.300+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.c.s.binder.DefaultBinderFactory      : Caching the binder: kafka
2025-02-09T06:44:37.373+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel processStockPrices-in-0
2025-02-09T06:44:37.376+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel errorChannel
2025-02-09T06:44:37.380+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel processStockPrices-out-0
2025-02-09T06:44:37.383+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel nullChannel
2025-02-09T06:44:37.386+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageHandler _org.springframework.integration.errorLogger
2025-02-09T06:44:37.392+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.admin.AdminClientConfig    : AdminClientConfig values: 
	auto.include.jmx.reporter = true
	bootstrap.controllers = []
	bootstrap.servers = [localhost:9092]
	client.dns.lookup = use_all_dns_ips
	client.id = spring-webflux-reactive-kafka-stream-admin-0
	connections.max.idle.ms = 300000
	default.api.timeout.ms = 60000
	enable.metrics.push = true
	metadata.max.age.ms = 300000
	metadata.recovery.strategy = none
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.max.ms = 1000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS

2025-02-09T06:44:37.404+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.admin.AdminClientConfig    : These configurations '[spring.json.trusted.packages]' were supplied but are not used yet.
2025-02-09T06:44:37.404+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.8.1
2025-02-09T06:44:37.404+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 70d6ff42debf7e17
2025-02-09T06:44:37.404+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1739051077404
2025-02-09T06:44:37.452+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [-stream-admin-0] o.a.kafka.common.utils.AppInfoParser     : App info kafka.admin.client for spring-webflux-reactive-kafka-stream-admin-0 unregistered
2025-02-09T06:44:37.454+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [-stream-admin-0] o.apache.kafka.common.metrics.Metrics    : Metrics scheduler closed
2025-02-09T06:44:37.455+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [-stream-admin-0] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2025-02-09T06:44:37.455+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [-stream-admin-0] o.apache.kafka.common.metrics.Metrics    : Metrics reporters closed
2025-02-09T06:44:37.460+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.i.endpoint.EventDrivenConsumer       : Adding {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
2025-02-09T06:44:37.460+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.i.channel.PublishSubscribeChannel    : Channel 'spring-webflux-reactive-kafka-stream.errorChannel' has 1 subscriber(s).
2025-02-09T06:44:37.460+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.i.endpoint.EventDrivenConsumer       : started bean '_org.springframework.integration.errorLogger'
2025-02-09T06:44:37.467+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.c.s.b.k.p.KafkaTopicProvisioner      : Using kafka topic for outbound: stock-prices-out
2025-02-09T06:44:37.467+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.admin.AdminClientConfig    : AdminClientConfig values: 
	auto.include.jmx.reporter = true
	bootstrap.controllers = []
	bootstrap.servers = [localhost:9092]
	client.dns.lookup = use_all_dns_ips
	client.id = 
	connections.max.idle.ms = 300000
	default.api.timeout.ms = 60000
	enable.metrics.push = true
	metadata.max.age.ms = 300000
	metadata.recovery.strategy = none
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.max.ms = 1000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS

2025-02-09T06:44:37.468+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.admin.AdminClientConfig    : These configurations '[spring.json.trusted.packages]' were supplied but are not used yet.
2025-02-09T06:44:37.468+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.8.1
2025-02-09T06:44:37.468+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 70d6ff42debf7e17
2025-02-09T06:44:37.468+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1739051077468
2025-02-09T06:44:37.487+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [| adminclient-1] o.a.kafka.common.utils.AppInfoParser     : App info kafka.admin.client for adminclient-1 unregistered
2025-02-09T06:44:37.488+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [| adminclient-1] o.apache.kafka.common.metrics.Metrics    : Metrics scheduler closed
2025-02-09T06:44:37.488+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [| adminclient-1] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2025-02-09T06:44:37.488+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [| adminclient-1] o.apache.kafka.common.metrics.Metrics    : Metrics reporters closed
2025-02-09T06:44:37.493+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.producer.ProducerConfig    : Idempotence will be disabled because acks is set to 1, not set to 'all'.
2025-02-09T06:44:37.494+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.producer.ProducerConfig    : ProducerConfig values: 
	acks = 1
	auto.include.jmx.reporter = true
	batch.size = 16384
	bootstrap.servers = [localhost:9092]
	buffer.memory = 33554432
	client.dns.lookup = use_all_dns_ips
	client.id = producer-1
	compression.gzip.level = -1
	compression.lz4.level = 9
	compression.type = none
	compression.zstd.level = 3
	connections.max.idle.ms = 540000
	delivery.timeout.ms = 120000
	enable.idempotence = false
	enable.metrics.push = true
	interceptor.classes = []
	key.serializer = class org.apache.kafka.common.serialization.StringSerializer
	linger.ms = 0
	max.block.ms = 60000
	max.in.flight.requests.per.connection = 5
	max.request.size = 1048576
	metadata.max.age.ms = 300000
	metadata.max.idle.ms = 300000
	metadata.recovery.strategy = none
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partitioner.adaptive.partitioning.enable = true
	partitioner.availability.timeout.ms = 0
	partitioner.class = null
	partitioner.ignore.keys = false
	receive.buffer.bytes = 32768
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.max.ms = 1000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	transaction.timeout.ms = 60000
	transactional.id = null
	value.serializer = class org.springframework.kafka.support.serializer.JsonSerializer

2025-02-09T06:44:37.494+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.c.t.i.KafkaMetricsCollector        : initializing Kafka metrics collector
2025-02-09T06:44:37.503+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.producer.ProducerConfig    : These configurations '[spring.json.trusted.packages]' were supplied but are not used yet.
2025-02-09T06:44:37.503+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.8.1
2025-02-09T06:44:37.503+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 70d6ff42debf7e17
2025-02-09T06:44:37.503+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1739051077503
2025-02-09T06:44:37.508+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Cluster ID: 5L6g3nShT-eMCtK--X86sw
2025-02-09T06:44:37.513+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.i.endpoint.ReactiveStreamsConsumer   : started org.springframework.integration.endpoint.ReactiveStreamsConsumer@2c56eba5
2025-02-09T06:44:37.577+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port 8080 (http)
2025-02-09T06:44:37.583+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.admin.AdminClientConfig    : AdminClientConfig values: 
	auto.include.jmx.reporter = true
	bootstrap.controllers = []
	bootstrap.servers = [localhost:9092]
	client.dns.lookup = use_all_dns_ips
	client.id = 
	connections.max.idle.ms = 300000
	default.api.timeout.ms = 60000
	enable.metrics.push = true
	metadata.max.age.ms = 300000
	metadata.recovery.strategy = none
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.max.ms = 1000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS

2025-02-09T06:44:37.584+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.admin.AdminClientConfig    : These configurations '[spring.json.trusted.packages]' were supplied but are not used yet.
2025-02-09T06:44:37.584+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.8.1
2025-02-09T06:44:37.584+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 70d6ff42debf7e17
2025-02-09T06:44:37.584+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1739051077584
2025-02-09T06:44:37.603+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [| adminclient-2] o.a.kafka.common.utils.AppInfoParser     : App info kafka.admin.client for adminclient-2 unregistered
2025-02-09T06:44:37.603+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [| adminclient-2] o.apache.kafka.common.metrics.Metrics    : Metrics scheduler closed
2025-02-09T06:44:37.603+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [| adminclient-2] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2025-02-09T06:44:37.603+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [| adminclient-2] o.apache.kafka.common.metrics.Metrics    : Metrics reporters closed
2025-02-09T06:44:37.604+09:00  WARN 24762 --- [spring-webflux-reactive-kafka-stream] [           main] b.k.p.KafkaBinderConfigurationProperties : Ignoring provided value(s) for 'group.id'. Use spring.cloud.stream.default.group or spring.cloud.stream.binding.<name>.group to specify the group instead of group.id
2025-02-09T06:44:37.605+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values: 
	allow.auto.create.topics = true
	auto.commit.interval.ms = 100
	auto.include.jmx.reporter = true
	auto.offset.reset = earliest
	bootstrap.servers = [localhost:9092]
	check.crcs = true
	client.dns.lookup = use_all_dns_ips
	client.id = consumer-live-stock-consumers-x-2
	client.rack = 
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = false
	enable.metrics.push = true
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = live-stock-consumers-x
	group.instance.id = null
	group.protocol = classic
	group.remote.assignor = null
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	internal.throw.on.fetch.stable.offset.unsupported = false
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metadata.recovery.strategy = none
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor, class org.apache.kafka.clients.consumer.CooperativeStickyAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.max.ms = 1000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	session.timeout.ms = 45000
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.springframework.kafka.support.serializer.JsonDeserializer

2025-02-09T06:44:37.605+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.c.t.i.KafkaMetricsCollector        : initializing Kafka metrics collector
2025-02-09T06:44:37.607+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.consumer.ConsumerConfig    : These configurations '[reactiveAutoCommit]' were supplied but are not used yet.
2025-02-09T06:44:37.607+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.8.1
2025-02-09T06:44:37.607+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 70d6ff42debf7e17
2025-02-09T06:44:37.607+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1739051077607
2025-02-09T06:44:37.613+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-live-stock-consumers-x-2, groupId=live-stock-consumers-x] Cluster ID: 5L6g3nShT-eMCtK--X86sw
2025-02-09T06:44:37.615+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-live-stock-consumers-x-2, groupId=live-stock-consumers-x] Resetting generation and member id due to: consumer pro-actively leaving the group
2025-02-09T06:44:37.615+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-live-stock-consumers-x-2, groupId=live-stock-consumers-x] Request joining group due to: consumer pro-actively leaving the group
2025-02-09T06:44:37.616+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.apache.kafka.common.metrics.Metrics    : Metrics scheduler closed
2025-02-09T06:44:37.616+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2025-02-09T06:44:37.616+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.telemetry.internals.ClientTelemetryReporter
2025-02-09T06:44:37.616+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.apache.kafka.common.metrics.Metrics    : Metrics reporters closed
2025-02-09T06:44:37.618+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : App info kafka.consumer for consumer-live-stock-consumers-x-2 unregistered
2025-02-09T06:44:37.633+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.c.stream.binder.BinderErrorChannel   : Channel 'kafka-1517972788.processStockPrices-in-0.errors' has 1 subscriber(s).
2025-02-09T06:44:37.634+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.c.stream.binder.BinderErrorChannel   : Channel 'kafka-1517972788.processStockPrices-in-0.errors' has 0 subscriber(s).
2025-02-09T06:44:37.634+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.c.stream.binder.BinderErrorChannel   : Channel 'kafka-1517972788.processStockPrices-in-0.errors' has 1 subscriber(s).
2025-02-09T06:44:37.634+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.s.c.stream.binder.BinderErrorChannel   : Channel 'kafka-1517972788.processStockPrices-in-0.errors' has 2 subscriber(s).
2025-02-09T06:44:37.645+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values: 
	allow.auto.create.topics = true
	auto.commit.interval.ms = 100
	auto.include.jmx.reporter = true
	auto.offset.reset = earliest
	bootstrap.servers = [localhost:9092]
	check.crcs = true
	client.dns.lookup = use_all_dns_ips
	client.id = consumer-live-stock-consumers-x-3
	client.rack = 
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = false
	enable.metrics.push = true
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = live-stock-consumers-x
	group.instance.id = null
	group.protocol = classic
	group.remote.assignor = null
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	internal.throw.on.fetch.stable.offset.unsupported = false
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metadata.recovery.strategy = none
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor, class org.apache.kafka.clients.consumer.CooperativeStickyAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.max.ms = 1000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	session.timeout.ms = 45000
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.springframework.kafka.support.serializer.JsonDeserializer

2025-02-09T06:44:37.645+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.c.t.i.KafkaMetricsCollector        : initializing Kafka metrics collector
2025-02-09T06:44:37.647+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.clients.consumer.ConsumerConfig    : These configurations '[reactiveAutoCommit]' were supplied but are not used yet.
2025-02-09T06:44:37.647+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.8.1
2025-02-09T06:44:37.647+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 70d6ff42debf7e17
2025-02-09T06:44:37.647+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1739051077647
2025-02-09T06:44:37.648+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] o.a.k.c.c.internals.LegacyKafkaConsumer  : [Consumer clientId=consumer-live-stock-consumers-x-3, groupId=live-stock-consumers-x] Subscribed to topic(s): stock-prices-in
2025-02-09T06:44:37.650+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] s.i.k.i.KafkaMessageDrivenChannelAdapter : started org.springframework.integration.kafka.inbound.KafkaMessageDrivenChannelAdapter@52eca410
2025-02-09T06:44:37.657+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-live-stock-consumers-x-3, groupId=live-stock-consumers-x] Cluster ID: 5L6g3nShT-eMCtK--X86sw
2025-02-09T06:44:37.659+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-live-stock-consumers-x-3, groupId=live-stock-consumers-x] Discovered group coordinator localhost:9092 (id: 2147483646 rack: null)
2025-02-09T06:44:37.659+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-live-stock-consumers-x-3, groupId=live-stock-consumers-x] (Re-)joining group
2025-02-09T06:44:37.665+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [           main] gWebfluxReactiveKafkaStreamApplicationKt : Started SpringWebfluxReactiveKafkaStreamApplicationKt in 2.371 seconds (process running for 2.719)
2025-02-09T06:44:37.671+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-live-stock-consumers-x-3, groupId=live-stock-consumers-x] Request joining group due to: need to re-join with the given member-id: consumer-live-stock-consumers-x-3-1de6c71d-e15d-40e6-ac07-e0a7ff0ab162
2025-02-09T06:44:37.672+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-live-stock-consumers-x-3, groupId=live-stock-consumers-x] (Re-)joining group
2025-02-09T06:44:37.680+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-live-stock-consumers-x-3, groupId=live-stock-consumers-x] Successfully joined group with generation Generation{generationId=17, memberId='consumer-live-stock-consumers-x-3-1de6c71d-e15d-40e6-ac07-e0a7ff0ab162', protocol='range'}
2025-02-09T06:44:37.684+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-live-stock-consumers-x-3, groupId=live-stock-consumers-x] Finished assignment for group at generation 17: {consumer-live-stock-consumers-x-3-1de6c71d-e15d-40e6-ac07-e0a7ff0ab162=Assignment(partitions=[stock-prices-in-0, stock-prices-in-1])}
2025-02-09T06:44:37.697+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-live-stock-consumers-x-3, groupId=live-stock-consumers-x] Successfully synced group in generation Generation{generationId=17, memberId='consumer-live-stock-consumers-x-3-1de6c71d-e15d-40e6-ac07-e0a7ff0ab162', protocol='range'}
2025-02-09T06:44:37.698+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-live-stock-consumers-x-3, groupId=live-stock-consumers-x] Notifying assignor about the new Assignment(partitions=[stock-prices-in-0, stock-prices-in-1])
2025-02-09T06:44:37.698+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] k.c.c.i.ConsumerRebalanceListenerInvoker : [Consumer clientId=consumer-live-stock-consumers-x-3, groupId=live-stock-consumers-x] Adding newly assigned partitions: stock-prices-in-0, stock-prices-in-1
2025-02-09T06:44:37.700+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] o.a.k.c.c.internals.ConsumerUtils        : Setting offset for partition stock-prices-in-0 to the committed offset FetchPosition{offset=20, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:9092 (id: 1 rack: null)], epoch=12}}
2025-02-09T06:44:37.700+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] o.a.k.c.c.internals.ConsumerUtils        : Setting offset for partition stock-prices-in-1 to the committed offset FetchPosition{offset=130, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:9092 (id: 1 rack: null)], epoch=12}}
2025-02-09T06:44:37.701+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] o.s.c.s.b.k.KafkaMessageChannelBinder$2  : live-stock-consumers-x: partitions assigned: [stock-prices-in-0, stock-prices-in-1]

```

### Call API

```text
POST http://localhost:8080/stock-prices-in?count=10

HTTP/1.1 200 OK
transfer-encoding: chunked
Content-Type: text/event-stream;charset=UTF-8

Response code: 200 (OK); Time: 291ms (291 ms)

data:{"metadata":{"offset":20,"timestamp":1739051108588,"serializedKeySize":4,"serializedValueSize":94,"topicPartition":{"hash":-932488366,"partition":0,"topic":"stock-prices-in"}},"exception":null,"correlationMetadata":null}

data:{"metadata":{"offset":130,"timestamp":1739051108557,"serializedKeySize":4,"serializedValueSize":93,"topicPartition":{"hash":-932488335,"partition":1,"topic":"stock-prices-in"}},"exception":null,"correlationMetadata":null}

data:{"metadata":{"offset":131,"timestamp":1739051108587,"serializedKeySize":4,"serializedValueSize":94,"topicPartition":{"hash":-932488335,"partition":1,"topic":"stock-prices-in"}},"exception":null,"correlationMetadata":null}

data:{"metadata":{"offset":132,"timestamp":1739051108587,"serializedKeySize":4,"serializedValueSize":94,"topicPartition":{"hash":-932488335,"partition":1,"topic":"stock-prices-in"}},"exception":null,"correlationMetadata":null}

data:{"metadata":{"offset":133,"timestamp":1739051108587,"serializedKeySize":4,"serializedValueSize":94,"topicPartition":{"hash":-932488335,"partition":1,"topic":"stock-prices-in"}},"exception":null,"correlationMetadata":null}

data:{"metadata":{"offset":134,"timestamp":1739051108587,"serializedKeySize":4,"serializedValueSize":94,"topicPartition":{"hash":-932488335,"partition":1,"topic":"stock-prices-in"}},"exception":null,"correlationMetadata":null}

data:{"metadata":{"offset":135,"timestamp":1739051108587,"serializedKeySize":4,"serializedValueSize":94,"topicPartition":{"hash":-932488335,"partition":1,"topic":"stock-prices-in"}},"exception":null,"correlationMetadata":null}

data:{"metadata":{"offset":136,"timestamp":1739051108588,"serializedKeySize":4,"serializedValueSize":94,"topicPartition":{"hash":-932488335,"partition":1,"topic":"stock-prices-in"}},"exception":null,"correlationMetadata":null}

data:{"metadata":{"offset":137,"timestamp":1739051108588,"serializedKeySize":4,"serializedValueSize":93,"topicPartition":{"hash":-932488335,"partition":1,"topic":"stock-prices-in"}},"exception":null,"correlationMetadata":null}

data:{"metadata":{"offset":21,"timestamp":1739051108588,"serializedKeySize":4,"serializedValueSize":94,"topicPartition":{"hash":-932488366,"partition":0,"topic":"stock-prices-in"}},"exception":null,"correlationMetadata":null}


Connection closed
```

```text
2025-02-09T06:45:08.532+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ctor-http-nio-2] o.a.k.clients.producer.ProducerConfig    : ProducerConfig values: 
	acks = -1
	auto.include.jmx.reporter = true
	batch.size = 16384
	bootstrap.servers = [localhost:9092]
	buffer.memory = 33554432
	client.dns.lookup = use_all_dns_ips
	client.id = producer-2
	compression.gzip.level = -1
	compression.lz4.level = 9
	compression.type = none
	compression.zstd.level = 3
	connections.max.idle.ms = 540000
	delivery.timeout.ms = 120000
	enable.idempotence = true
	enable.metrics.push = true
	interceptor.classes = []
	key.serializer = class org.apache.kafka.common.serialization.StringSerializer
	linger.ms = 0
	max.block.ms = 60000
	max.in.flight.requests.per.connection = 5
	max.request.size = 1048576
	metadata.max.age.ms = 300000
	metadata.max.idle.ms = 300000
	metadata.recovery.strategy = none
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partitioner.adaptive.partitioning.enable = true
	partitioner.availability.timeout.ms = 0
	partitioner.class = null
	partitioner.ignore.keys = false
	receive.buffer.bytes = 32768
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.max.ms = 1000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	transaction.timeout.ms = 60000
	transactional.id = null
	value.serializer = class org.springframework.kafka.support.serializer.JsonSerializer

2025-02-09T06:45:08.532+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ctor-http-nio-2] o.a.k.c.t.i.KafkaMetricsCollector        : initializing Kafka metrics collector
2025-02-09T06:45:08.536+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ctor-http-nio-2] o.a.k.clients.producer.KafkaProducer     : [Producer clientId=producer-2] Instantiated an idempotent producer.
2025-02-09T06:45:08.538+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ctor-http-nio-2] o.a.k.clients.producer.ProducerConfig    : These configurations '[spring.json.trusted.packages]' were supplied but are not used yet.
2025-02-09T06:45:08.538+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ctor-http-nio-2] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.8.1
2025-02-09T06:45:08.538+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ctor-http-nio-2] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 70d6ff42debf7e17
2025-02-09T06:45:08.538+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ctor-http-nio-2] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1739051108538
2025-02-09T06:45:08.557+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ad | producer-2] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-2] Cluster ID: 5L6g3nShT-eMCtK--X86sw
2025-02-09T06:45:08.685+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ad | producer-2] o.a.k.c.p.internals.TransactionManager   : [Producer clientId=producer-2] ProducerId set to 4000 with epoch 0
2025-02-09T06:45:08.756+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.k.p.StockPriceProcessor        : message: StockUpdate(symbol=MSFT, price=159.80228315220177, currency=USD, timestamp=2025-02-08T21:45:08.540624Z)
2025-02-09T06:45:08.760+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.r.ClickHouseRepository         : Saved stock price: StockUpdate(symbol=MSFT, price=159.80228315220177, currency=USD, timestamp=2025-02-08T21:45:08.540624Z)
2025-02-09T06:45:08.764+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.k.p.StockPriceProcessor        : message: StockUpdate(symbol=MSFT, price=275.24446602902094, currency=USD, timestamp=2025-02-08T21:45:08.540747Z)
2025-02-09T06:45:08.765+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.r.ClickHouseRepository         : Saved stock price: StockUpdate(symbol=MSFT, price=275.24446602902094, currency=USD, timestamp=2025-02-08T21:45:08.540747Z)
2025-02-09T06:45:08.765+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.k.p.StockPriceProcessor        : message: StockUpdate(symbol=AMZN, price=270.3526108647179, currency=USD, timestamp=2025-02-08T21:45:08.529372Z)
2025-02-09T06:45:08.766+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.r.ClickHouseRepository         : Saved stock price: StockUpdate(symbol=AMZN, price=270.3526108647179, currency=USD, timestamp=2025-02-08T21:45:08.529372Z)
2025-02-09T06:45:08.767+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.k.p.StockPriceProcessor        : message: StockUpdate(symbol=AMZN, price=202.92541904193462, currency=USD, timestamp=2025-02-08T21:45:08.540358Z)
2025-02-09T06:45:08.767+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.r.ClickHouseRepository         : Saved stock price: StockUpdate(symbol=AMZN, price=202.92541904193462, currency=USD, timestamp=2025-02-08T21:45:08.540358Z)
2025-02-09T06:45:08.768+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.k.p.StockPriceProcessor        : message: StockUpdate(symbol=TSLA, price=280.30169806073843, currency=USD, timestamp=2025-02-08T21:45:08.540447Z)
2025-02-09T06:45:08.768+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.r.ClickHouseRepository         : Saved stock price: StockUpdate(symbol=TSLA, price=280.30169806073843, currency=USD, timestamp=2025-02-08T21:45:08.540447Z)
2025-02-09T06:45:08.769+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.k.p.StockPriceProcessor        : message: StockUpdate(symbol=TSLA, price=288.48351758249146, currency=USD, timestamp=2025-02-08T21:45:08.540496Z)
2025-02-09T06:45:08.770+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.r.ClickHouseRepository         : Saved stock price: StockUpdate(symbol=TSLA, price=288.48351758249146, currency=USD, timestamp=2025-02-08T21:45:08.540496Z)
2025-02-09T06:45:08.770+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.k.p.StockPriceProcessor        : message: StockUpdate(symbol=GOOG, price=200.40260273827005, currency=USD, timestamp=2025-02-08T21:45:08.540539Z)
2025-02-09T06:45:08.771+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.r.ClickHouseRepository         : Saved stock price: StockUpdate(symbol=GOOG, price=200.40260273827005, currency=USD, timestamp=2025-02-08T21:45:08.540539Z)
2025-02-09T06:45:08.772+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.k.p.StockPriceProcessor        : message: StockUpdate(symbol=TSLA, price=178.81439612914437, currency=USD, timestamp=2025-02-08T21:45:08.540583Z)
2025-02-09T06:45:08.772+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.r.ClickHouseRepository         : Saved stock price: StockUpdate(symbol=TSLA, price=178.81439612914437, currency=USD, timestamp=2025-02-08T21:45:08.540583Z)
2025-02-09T06:45:08.773+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.k.p.StockPriceProcessor        : message: StockUpdate(symbol=AMZN, price=140.54137626583224, currency=USD, timestamp=2025-02-08T21:45:08.540665Z)
2025-02-09T06:45:08.773+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.r.ClickHouseRepository         : Saved stock price: StockUpdate(symbol=AMZN, price=140.54137626583224, currency=USD, timestamp=2025-02-08T21:45:08.540665Z)
2025-02-09T06:45:08.774+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.k.p.StockPriceProcessor        : message: StockUpdate(symbol=AMZN, price=120.3604390612322, currency=USD, timestamp=2025-02-08T21:45:08.540705Z)
2025-02-09T06:45:08.774+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ckHouseWorker-5] m.b.r.k.s.k.p.StockPriceProcessor        : Updated message: StockUpdate(symbol=MSFT, price=191.762739782642116903353034270274246608778412337414920330047607421875, currency=EUR, timestamp=2025-02-08T21:45:08.540624Z)
2025-02-09T06:45:08.775+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [container-0-C-1] m.b.r.k.s.r.ClickHouseRepository         : Saved stock price: StockUpdate(symbol=AMZN, price=120.3604390612322, currency=USD, timestamp=2025-02-08T21:45:08.540705Z)
2025-02-09T06:45:08.776+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ckHouseWorker-9] m.b.r.k.s.k.p.StockPriceProcessor        : Updated message: StockUpdate(symbol=TSLA, price=336.362037672886103552104038857584189514682293520309031009674072265625, currency=EUR, timestamp=2025-02-08T21:45:08.540447Z)
2025-02-09T06:45:08.787+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ckHouseWorker-6] m.b.r.k.s.k.p.StockPriceProcessor        : Updated message: StockUpdate(symbol=MSFT, price=330.293359234825115776690256556968883216995891416445374488830566406250, currency=EUR, timestamp=2025-02-08T21:45:08.540747Z)
2025-02-09T06:45:08.790+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ckHouseWorker-7] m.b.r.k.s.k.p.StockPriceProcessor        : Updated message: StockUpdate(symbol=AMZN, price=324.42313303766146799393226601859741009548088186420500278472900390625, currency=EUR, timestamp=2025-02-08T21:45:08.529372Z)
2025-02-09T06:45:08.790+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [ckHouseWorker-8] m.b.r.k.s.k.p.StockPriceProcessor        : Updated message: StockUpdate(symbol=AMZN, price=243.510502850321534988301099917440417641500971512869000434875488281250, currency=EUR, timestamp=2025-02-08T21:45:08.540358Z)
2025-02-09T06:45:08.792+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] m.b.r.k.s.k.consumer.StockPriceConsumer  : received key=MSFT, value=StockUpdate(symbol=MSFT, price=191.762739782642116903353034270274246608778412337414920330047607421875, currency=EUR, timestamp=2025-02-08T21:45:08.540624Z) from topic=stock-prices-out, offset=3, partition=0
2025-02-09T06:45:08.793+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] m.b.r.k.s.k.consumer.StockPriceConsumer  : received key=MSFT, value=StockUpdate(symbol=MSFT, price=330.293359234825115776690256556968883216995891416445374488830566406250, currency=EUR, timestamp=2025-02-08T21:45:08.540747Z) from topic=stock-prices-out, offset=4, partition=0
2025-02-09T06:45:08.795+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] m.b.r.k.s.k.consumer.StockPriceConsumer  : received key=AMZN, value=StockUpdate(symbol=AMZN, price=324.42313303766146799393226601859741009548088186420500278472900390625, currency=EUR, timestamp=2025-02-08T21:45:08.529372Z) from topic=stock-prices-out, offset=17, partition=1
2025-02-09T06:45:08.795+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] m.b.r.k.s.k.consumer.StockPriceConsumer  : received key=AMZN, value=StockUpdate(symbol=AMZN, price=243.510502850321534988301099917440417641500971512869000434875488281250, currency=EUR, timestamp=2025-02-08T21:45:08.540358Z) from topic=stock-prices-out, offset=18, partition=1
2025-02-09T06:45:08.802+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] m.b.r.k.s.k.consumer.StockPriceConsumer  : received key=TSLA, value=StockUpdate(symbol=TSLA, price=336.362037672886103552104038857584189514682293520309031009674072265625, currency=EUR, timestamp=2025-02-08T21:45:08.540447Z) from topic=stock-prices-out, offset=19, partition=1
2025-02-09T06:45:08.815+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [kHouseWorker-11] m.b.r.k.s.k.p.StockPriceProcessor        : Updated message: StockUpdate(symbol=GOOG, price=240.483123285924051100336649806565869624819242744706571102142333984375, currency=EUR, timestamp=2025-02-08T21:45:08.540539Z)
2025-02-09T06:45:08.817+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [kHouseWorker-13] m.b.r.k.s.k.p.StockPriceProcessor        : Updated message: StockUpdate(symbol=AMZN, price=168.649651518998681758709126286621682311306358315050601959228515625000, currency=EUR, timestamp=2025-02-08T21:45:08.540665Z)
2025-02-09T06:45:08.819+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [kHouseWorker-14] m.b.r.k.s.k.p.StockPriceProcessor        : Updated message: StockUpdate(symbol=AMZN, price=144.43252687347863465492277200907800249751744559034705162048339843750, currency=EUR, timestamp=2025-02-08T21:45:08.540705Z)
2025-02-09T06:45:08.820+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [kHouseWorker-10] m.b.r.k.s.k.p.StockPriceProcessor        : Updated message: StockUpdate(symbol=TSLA, price=346.180221098989739188758262202472160140587220666930079460144042968750, currency=EUR, timestamp=2025-02-08T21:45:08.540496Z)
2025-02-09T06:45:08.825+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] m.b.r.k.s.k.consumer.StockPriceConsumer  : received key=TSLA, value=StockUpdate(symbol=TSLA, price=346.180221098989739188758262202472160140587220666930079460144042968750, currency=EUR, timestamp=2025-02-08T21:45:08.540496Z) from topic=stock-prices-out, offset=20, partition=1
2025-02-09T06:45:08.825+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [kHouseWorker-12] m.b.r.k.s.k.p.StockPriceProcessor        : Updated message: StockUpdate(symbol=TSLA, price=214.577275354973236059045611319218149759535663179121911525726318359375, currency=EUR, timestamp=2025-02-08T21:45:08.540583Z)
2025-02-09T06:45:08.828+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] m.b.r.k.s.k.consumer.StockPriceConsumer  : received key=GOOG, value=StockUpdate(symbol=GOOG, price=240.483123285924051100336649806565869624819242744706571102142333984375, currency=EUR, timestamp=2025-02-08T21:45:08.540539Z) from topic=stock-prices-out, offset=21, partition=1
2025-02-09T06:45:08.831+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] m.b.r.k.s.k.consumer.StockPriceConsumer  : received key=TSLA, value=StockUpdate(symbol=TSLA, price=214.577275354973236059045611319218149759535663179121911525726318359375, currency=EUR, timestamp=2025-02-08T21:45:08.540583Z) from topic=stock-prices-out, offset=22, partition=1
2025-02-09T06:45:08.835+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] m.b.r.k.s.k.consumer.StockPriceConsumer  : received key=AMZN, value=StockUpdate(symbol=AMZN, price=168.649651518998681758709126286621682311306358315050601959228515625000, currency=EUR, timestamp=2025-02-08T21:45:08.540665Z) from topic=stock-prices-out, offset=23, partition=1
2025-02-09T06:45:08.837+09:00  INFO 24762 --- [spring-webflux-reactive-kafka-stream] [afka-my-group-1] m.b.r.k.s.k.consumer.StockPriceConsumer  : received key=AMZN, value=StockUpdate(symbol=AMZN, price=144.43252687347863465492277200907800249751744559034705162048339843750, currency=EUR, timestamp=2025-02-08T21:45:08.540705Z) from topic=stock-prices-out, offset=24, partition=1

```

## References

- [https://www.baeldung.com/java-spring-webflux-reactive-kafka](https://www.baeldung.com/java-spring-webflux-reactive-kafka)
- [https://github.com/eugenp/tutorials/tree/master/spring-reactive-modules/spring-reactive-kafka-stream-binder](https://github.com/eugenp/tutorials/tree/master/spring-reactive-modules/spring-reactive-kafka-stream-binder)
